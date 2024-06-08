package com.springbank.api.controller;

import com.springbank.api.model.Notice;
import com.springbank.api.repository.NoticeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.CacheControl;
import java.util.List;
import java.util.concurrent.TimeUnit;


@RestController
@AllArgsConstructor
public class NoticesController {
    private NoticeRepository noticeRepository;
    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNotices() {

        List<Notice> notices = noticeRepository.findAllActiveNotices();
        if (notices != null ) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(notices);
        }else {
            return null;
        }
    }
}
