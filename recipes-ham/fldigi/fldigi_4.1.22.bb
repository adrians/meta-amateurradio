SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "ecd6998e50c3888008baac5e3bc382b0"
SRC_URI[sha256sum] = "0b146f3cec9d51b0c3000edda416041b49d6de4216a331a3a008a91ec2c731fe"

inherit autotools gettext

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
