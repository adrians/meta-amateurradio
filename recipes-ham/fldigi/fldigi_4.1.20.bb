SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "b7c93a9477dbd35526506bd2541578fe"
SRC_URI[sha256sum] = "5030900a0f6905eb86dbe68e41fff0be781eecee6d42007675540e2a23bec438"

inherit autotools gettext

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
