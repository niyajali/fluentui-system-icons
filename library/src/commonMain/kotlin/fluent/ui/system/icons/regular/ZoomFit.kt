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
 * ZoomFit icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: zoom, fit
 * - Source: ic_fluent_zoom_fit_24_regular.svg
 * 
 * @return The [ImageVector] for the ZoomFit icon.
 */
public val FluentIcons.Regular.ZoomFit: ImageVector
    get() {
        if (_zoomFit != null) {
            return _zoomFit!!
        }
        _zoomFit = Builder(name = "ZoomFit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.489f, 2.707f)
                curveTo(11.779f, 2.434f, 12.231f, 2.435f, 12.519f, 2.709f)
                lineTo(14.726f, 4.8f)
                curveTo(15.027f, 5.085f, 15.502f, 5.072f, 15.787f, 4.771f)
                curveTo(16.072f, 4.471f, 16.059f, 3.996f, 15.758f, 3.711f)
                lineTo(13.551f, 1.62f)
                curveTo(12.685f, 0.799f, 11.329f, 0.797f, 10.461f, 1.615f)
                lineTo(8.237f, 3.71f)
                curveTo(7.935f, 3.994f, 7.921f, 4.468f, 8.205f, 4.77f)
                curveTo(8.489f, 5.071f, 8.964f, 5.085f, 9.265f, 4.801f)
                lineTo(11.489f, 2.707f)
                close()
                moveTo(4.803f, 9.263f)
                curveTo(5.087f, 8.962f, 5.073f, 8.487f, 4.772f, 8.203f)
                curveTo(4.47f, 7.919f, 3.996f, 7.933f, 3.712f, 8.235f)
                lineTo(1.617f, 10.459f)
                curveTo(0.799f, 11.327f, 0.801f, 12.683f, 1.622f, 13.549f)
                lineTo(3.713f, 15.756f)
                curveTo(3.998f, 16.057f, 4.473f, 16.07f, 4.773f, 15.785f)
                curveTo(5.074f, 15.5f, 5.087f, 15.025f, 4.802f, 14.724f)
                lineTo(2.71f, 12.517f)
                curveTo(2.437f, 12.229f, 2.436f, 11.777f, 2.709f, 11.487f)
                lineTo(4.803f, 9.263f)
                close()
                moveTo(20.288f, 8.243f)
                curveTo(20.003f, 7.942f, 19.528f, 7.93f, 19.228f, 8.215f)
                curveTo(18.927f, 8.5f, 18.915f, 8.975f, 19.2f, 9.275f)
                lineTo(21.298f, 11.488f)
                curveTo(21.573f, 11.778f, 21.573f, 12.231f, 21.298f, 12.521f)
                lineTo(19.2f, 14.734f)
                curveTo(18.915f, 15.035f, 18.927f, 15.509f, 19.228f, 15.794f)
                curveTo(19.528f, 16.079f, 20.003f, 16.067f, 20.288f, 15.766f)
                lineTo(22.387f, 13.553f)
                curveTo(23.21f, 12.685f, 23.21f, 11.324f, 22.387f, 10.456f)
                lineTo(20.288f, 8.243f)
                close()
                moveTo(15.766f, 20.288f)
                curveTo(16.067f, 20.003f, 16.079f, 19.528f, 15.794f, 19.228f)
                curveTo(15.509f, 18.927f, 15.035f, 18.914f, 14.734f, 19.199f)
                lineTo(12.522f, 21.297f)
                curveTo(12.233f, 21.571f, 11.779f, 21.572f, 11.49f, 21.297f)
                lineTo(9.275f, 19.199f)
                curveTo(8.974f, 18.914f, 8.499f, 18.927f, 8.215f, 19.228f)
                curveTo(7.93f, 19.529f, 7.943f, 20.003f, 8.243f, 20.288f)
                lineTo(10.459f, 22.386f)
                curveTo(11.327f, 23.209f, 12.686f, 23.208f, 13.554f, 22.386f)
                lineTo(15.766f, 20.288f)
                close()
                moveTo(9.75f, 7.0f)
                curveTo(8.231f, 7.0f, 7.0f, 8.231f, 7.0f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(7.0f, 15.769f, 8.231f, 17.0f, 9.75f, 17.0f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 17.0f, 17.0f, 15.769f, 17.0f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(17.0f, 8.231f, 15.769f, 7.0f, 14.25f, 7.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(8.5f, 9.75f)
                curveTo(8.5f, 9.06f, 9.06f, 8.5f, 9.75f, 8.5f)
                horizontalLineTo(14.25f)
                curveTo(14.94f, 8.5f, 15.5f, 9.06f, 15.5f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(15.5f, 14.94f, 14.94f, 15.5f, 14.25f, 15.5f)
                horizontalLineTo(9.75f)
                curveTo(9.06f, 15.5f, 8.5f, 14.94f, 8.5f, 14.25f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _zoomFit!!
    }

@Suppress("ObjectPropertyName")
private var _zoomFit: ImageVector? = null

@Preview
@Composable
private fun ZoomFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ZoomFit, contentDescription = null)
    }
}

