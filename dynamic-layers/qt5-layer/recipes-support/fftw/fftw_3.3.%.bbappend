# fftw static libraries are required by wsjtx and js8call

EXTRA_OECONF:append = " --enable-static --enable-fortran "
