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

package fluent.ui.system.icons.filled

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
 * PinGlobe icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: pin, globe
 * - Source: ic_fluent_pin_globe_20_filled.svg
 * 
 * @return The [ImageVector] for the PinGlobe icon.
 */
public val FluentIcons.Filled.PinGlobe: ImageVector
    get() {
        if (_pinGlobe != null) {
            return _pinGlobe!!
        }
        _pinGlobe = Builder(name = "PinGlobe", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.325f, 2.618f)
                curveTo(12.36f, 1.653f, 10.733f, 1.917f, 10.122f, 3.138f)
                lineTo(8.393f, 6.596f)
                curveTo(8.229f, 6.925f, 7.949f, 7.182f, 7.608f, 7.318f)
                lineTo(4.018f, 8.754f)
                curveTo(3.352f, 9.021f, 3.175f, 9.882f, 3.683f, 10.39f)
                lineTo(6.293f, 13.0f)
                lineTo(3.0f, 16.293f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.707f)
                lineTo(7.0f, 13.707f)
                lineTo(9.175f, 15.882f)
                curveTo(9.061f, 15.44f, 9.0f, 14.977f, 9.0f, 14.5f)
                curveTo(9.0f, 11.462f, 11.462f, 9.0f, 14.5f, 9.0f)
                curveTo(15.468f, 9.0f, 16.378f, 9.25f, 17.168f, 9.689f)
                curveTo(18.121f, 8.98f, 18.26f, 7.553f, 17.382f, 6.675f)
                lineTo(13.325f, 2.618f)
                close()
                moveTo(13.55f, 11.15f)
                curveTo(13.259f, 11.877f, 13.057f, 12.872f, 13.01f, 14.0f)
                horizontalLineTo(15.99f)
                curveTo(15.943f, 12.872f, 15.741f, 11.877f, 15.45f, 11.15f)
                curveTo(15.283f, 10.733f, 15.097f, 10.428f, 14.915f, 10.236f)
                curveTo(14.735f, 10.046f, 14.594f, 10.0f, 14.5f, 10.0f)
                curveTo(14.406f, 10.0f, 14.265f, 10.046f, 14.085f, 10.236f)
                curveTo(13.903f, 10.428f, 13.717f, 10.733f, 13.55f, 11.15f)
                close()
                moveTo(12.829f, 10.32f)
                curveTo(12.755f, 10.465f, 12.685f, 10.619f, 12.621f, 10.779f)
                curveTo(12.277f, 11.641f, 12.057f, 12.766f, 12.009f, 14.0f)
                horizontalLineTo(10.027f)
                curveTo(10.213f, 12.323f, 11.319f, 10.924f, 12.829f, 10.32f)
                close()
                moveTo(16.17f, 10.32f)
                curveTo(16.245f, 10.465f, 16.314f, 10.619f, 16.378f, 10.779f)
                curveTo(16.723f, 11.641f, 16.943f, 12.766f, 16.99f, 14.0f)
                horizontalLineTo(18.972f)
                curveTo(18.787f, 12.323f, 17.681f, 10.924f, 16.17f, 10.32f)
                close()
                moveTo(18.972f, 15.0f)
                horizontalLineTo(16.99f)
                curveTo(16.943f, 16.234f, 16.723f, 17.359f, 16.378f, 18.221f)
                curveTo(16.314f, 18.381f, 16.245f, 18.535f, 16.17f, 18.68f)
                curveTo(17.681f, 18.076f, 18.787f, 16.677f, 18.972f, 15.0f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(14.594f, 19.0f, 14.735f, 18.954f, 14.915f, 18.764f)
                curveTo(15.097f, 18.572f, 15.283f, 18.267f, 15.45f, 17.85f)
                curveTo(15.741f, 17.123f, 15.943f, 16.128f, 15.99f, 15.0f)
                horizontalLineTo(13.01f)
                curveTo(13.057f, 16.128f, 13.259f, 17.123f, 13.55f, 17.85f)
                curveTo(13.717f, 18.267f, 13.903f, 18.572f, 14.085f, 18.764f)
                curveTo(14.265f, 18.954f, 14.406f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(12.829f, 18.68f)
                curveTo(11.319f, 18.076f, 10.213f, 16.677f, 10.027f, 15.0f)
                horizontalLineTo(12.009f)
                curveTo(12.057f, 16.234f, 12.277f, 17.359f, 12.621f, 18.221f)
                curveTo(12.685f, 18.381f, 12.755f, 18.535f, 12.829f, 18.68f)
                close()
            }
        }
        .build()
        return _pinGlobe!!
    }

@Suppress("ObjectPropertyName")
private var _pinGlobe: ImageVector? = null

@Preview
@Composable
private fun PinGlobePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PinGlobe, contentDescription = null)
    }
}

