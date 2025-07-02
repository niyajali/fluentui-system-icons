/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * WarningLockOpen icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: warning, lock, open
 * - Source: ic_fluent_warning_lock_open_24_regular.svg
 * 
 * @return The [ImageVector] for the WarningLockOpen icon.
 */
public val FluentIcons.Regular.WarningLockOpen: ImageVector
    get() {
        if (_warningLockOpen != null) {
            return _warningLockOpen!!
        }
        _warningLockOpen = Builder(name = "WarningLockOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.997f, 16.0f)
                curveTo(11.997f, 15.448f, 11.55f, 15.001f, 10.999f, 15.001f)
                curveTo(10.447f, 15.001f, 10.0f, 15.448f, 10.0f, 16.0f)
                curveTo(10.0f, 16.552f, 10.447f, 16.999f, 10.999f, 16.999f)
                curveTo(11.55f, 16.999f, 11.997f, 16.552f, 11.997f, 16.0f)
                close()
                moveTo(11.738f, 8.147f)
                curveTo(11.688f, 7.781f, 11.374f, 7.499f, 10.995f, 7.499f)
                curveTo(10.58f, 7.499f, 10.245f, 7.835f, 10.245f, 8.25f)
                lineTo(10.249f, 12.751f)
                lineTo(10.256f, 12.853f)
                curveTo(10.306f, 13.219f, 10.62f, 13.501f, 10.999f, 13.501f)
                curveTo(11.413f, 13.5f, 11.749f, 13.164f, 11.749f, 12.75f)
                lineTo(11.745f, 8.248f)
                lineTo(11.738f, 8.147f)
                close()
                moveTo(12.967f, 2.659f)
                curveTo(12.111f, 1.111f, 9.886f, 1.111f, 9.03f, 2.659f)
                lineTo(1.284f, 16.66f)
                curveTo(0.455f, 18.16f, 1.539f, 20.0f, 3.253f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.253f)
                curveTo(2.682f, 18.5f, 2.32f, 17.886f, 2.597f, 17.386f)
                lineTo(10.342f, 3.385f)
                curveTo(10.628f, 2.869f, 11.369f, 2.869f, 11.655f, 3.385f)
                lineTo(17.527f, 14.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 13.435f, 18.134f, 12.901f, 18.372f, 12.428f)
                lineTo(12.967f, 2.659f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(19.0f, 12.619f, 20.119f, 11.5f, 21.5f, 11.5f)
                curveTo(22.881f, 11.5f, 24.0f, 12.619f, 24.0f, 14.0f)
                curveTo(24.0f, 14.414f, 23.664f, 14.75f, 23.25f, 14.75f)
                curveTo(22.836f, 14.75f, 22.5f, 14.414f, 22.5f, 14.0f)
                curveTo(22.5f, 13.448f, 22.052f, 13.0f, 21.5f, 13.0f)
                curveTo(20.948f, 13.0f, 20.5f, 13.448f, 20.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 15.0f, 23.0f, 15.672f, 23.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(23.0f, 22.328f, 22.328f, 23.0f, 21.5f, 23.0f)
                horizontalLineTo(15.5f)
                curveTo(14.672f, 23.0f, 14.0f, 22.328f, 14.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(14.0f, 15.672f, 14.672f, 15.0f, 15.5f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(18.5f, 20.0f)
                curveTo(19.052f, 20.0f, 19.5f, 19.552f, 19.5f, 19.0f)
                curveTo(19.5f, 18.448f, 19.052f, 18.0f, 18.5f, 18.0f)
                curveTo(17.948f, 18.0f, 17.5f, 18.448f, 17.5f, 19.0f)
                curveTo(17.5f, 19.552f, 17.948f, 20.0f, 18.5f, 20.0f)
                close()
            }
        }
        .build()
        return _warningLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _warningLockOpen: ImageVector? = null

@Preview
@Composable
private fun WarningLockOpenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WarningLockOpen, contentDescription = null)
    }
}

