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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.HourglassThreeQuarter: ImageVector
    get() {
        if (_HourglassThreeQuarter != null) {
            return _HourglassThreeQuarter!!
        }
        _HourglassThreeQuarter = ImageVector.Builder(
            name = "Filled.HourglassThreeQuarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.97f, 7f)
                curveTo(7.211f, 7.397f, 7.535f, 7.738f, 7.92f, 8f)
                lineTo(10f, 9.48f)
                curveTo(10.42f, 9.758f, 10.77f, 10.131f, 11.02f, 10.569f)
                curveTo(11.544f, 11.485f, 11.544f, 12.515f, 11.02f, 13.431f)
                curveTo(10.77f, 13.869f, 10.42f, 14.242f, 10f, 14.52f)
                lineTo(7.92f, 16f)
                curveTo(7.487f, 16.294f, 7.131f, 16.689f, 6.884f, 17.15f)
                curveTo(6.637f, 17.612f, 6.505f, 18.126f, 6.5f, 18.65f)
                verticalLineTo(19.25f)
                curveTo(6.5f, 19.316f, 6.526f, 19.38f, 6.573f, 19.427f)
                curveTo(6.62f, 19.474f, 6.684f, 19.5f, 6.75f, 19.5f)
                horizontalLineTo(17.25f)
                curveTo(17.316f, 19.5f, 17.38f, 19.474f, 17.427f, 19.427f)
                curveTo(17.474f, 19.38f, 17.5f, 19.316f, 17.5f, 19.25f)
                verticalLineTo(18.65f)
                curveTo(17.495f, 18.126f, 17.363f, 17.612f, 17.116f, 17.15f)
                curveTo(16.869f, 16.689f, 16.513f, 16.294f, 16.08f, 16f)
                lineTo(14f, 14.52f)
                curveTo(13.58f, 14.242f, 13.23f, 13.869f, 12.98f, 13.431f)
                curveTo(12.456f, 12.515f, 12.456f, 11.485f, 12.98f, 10.569f)
                curveTo(13.23f, 10.131f, 13.58f, 9.758f, 14f, 9.48f)
                lineTo(16.08f, 8f)
                curveTo(16.465f, 7.738f, 16.789f, 7.397f, 17.03f, 7f)
                horizontalLineTo(6.97f)
                close()
            }
        }.build()

        return _HourglassThreeQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _HourglassThreeQuarter: ImageVector? = null

@Preview
@Composable
private fun HourglassThreeQuarterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HourglassThreeQuarter, contentDescription = null)
    }
}
