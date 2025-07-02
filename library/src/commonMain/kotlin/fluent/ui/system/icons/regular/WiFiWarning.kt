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
 * WiFiWarning icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: wi, fi, warning
 * - Source: ic_fluent_wifi_warning_24_regular.svg
 * 
 * @return The [ImageVector] for the WiFiWarning icon.
 */
public val FluentIcons.Regular.WiFiWarning: ImageVector
    get() {
        if (_wiFiWarning != null) {
            return _wiFiWarning!!
        }
        _wiFiWarning = Builder(name = "WiFiWarning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.744f, 10.751f)
                curveTo(17.843f, 10.849f, 17.939f, 10.951f, 18.033f, 11.056f)
                curveTo(17.411f, 10.923f, 16.744f, 11.026f, 16.19f, 11.365f)
                curveTo(13.612f, 9.258f, 9.807f, 9.407f, 7.404f, 11.811f)
                curveTo(6.906f, 12.309f, 6.501f, 12.869f, 6.19f, 13.484f)
                curveTo(6.003f, 13.854f, 5.552f, 14.002f, 5.182f, 13.815f)
                curveTo(4.813f, 13.628f, 4.665f, 13.177f, 4.852f, 12.807f)
                curveTo(5.234f, 12.05f, 5.732f, 11.361f, 6.343f, 10.751f)
                curveTo(9.491f, 7.602f, 14.596f, 7.602f, 17.744f, 10.751f)
                close()
                moveTo(11.957f, 19.0f)
                lineTo(13.173f, 16.566f)
                curveTo(13.138f, 16.522f, 13.101f, 16.479f, 13.06f, 16.439f)
                curveTo(12.474f, 15.853f, 11.524f, 15.853f, 10.939f, 16.439f)
                curveTo(10.353f, 17.025f, 10.353f, 17.975f, 10.939f, 18.561f)
                curveTo(11.221f, 18.843f, 11.587f, 18.989f, 11.957f, 19.0f)
                close()
                moveTo(14.186f, 14.538f)
                lineTo(14.864f, 13.181f)
                curveTo(12.886f, 11.861f, 10.188f, 12.073f, 8.442f, 13.819f)
                curveTo(7.995f, 14.266f, 7.638f, 14.801f, 7.381f, 15.389f)
                curveTo(7.215f, 15.769f, 7.388f, 16.211f, 7.767f, 16.377f)
                curveTo(8.147f, 16.543f, 8.589f, 16.37f, 8.755f, 15.991f)
                curveTo(8.94f, 15.569f, 9.192f, 15.191f, 9.502f, 14.88f)
                curveTo(10.78f, 13.603f, 12.78f, 13.488f, 14.186f, 14.538f)
                close()
                moveTo(20.448f, 8.279f)
                curveTo(20.957f, 8.788f, 21.437f, 9.369f, 21.856f, 9.976f)
                curveTo(22.091f, 10.316f, 22.005f, 10.784f, 21.664f, 11.019f)
                curveTo(21.324f, 11.254f, 20.857f, 11.168f, 20.621f, 10.828f)
                curveTo(20.253f, 10.294f, 19.83f, 9.783f, 19.387f, 9.339f)
                curveTo(15.307f, 5.259f, 8.692f, 5.259f, 4.612f, 9.339f)
                curveTo(4.19f, 9.761f, 3.771f, 10.273f, 3.39f, 10.823f)
                curveTo(3.154f, 11.163f, 2.686f, 11.248f, 2.346f, 11.012f)
                curveTo(2.006f, 10.776f, 1.921f, 10.308f, 2.157f, 9.968f)
                curveTo(2.587f, 9.348f, 3.062f, 8.768f, 3.551f, 8.279f)
                curveTo(8.217f, 3.613f, 15.782f, 3.613f, 20.448f, 8.279f)
                close()
                moveTo(16.157f, 12.83f)
                lineTo(12.16f, 20.828f)
                curveTo(11.661f, 21.826f, 12.387f, 23.0f, 13.503f, 23.0f)
                horizontalLineTo(21.497f)
                curveTo(22.613f, 23.0f, 23.338f, 21.826f, 22.84f, 20.828f)
                lineTo(18.843f, 12.83f)
                curveTo(18.29f, 11.723f, 16.71f, 11.723f, 16.157f, 12.83f)
                close()
                moveTo(18.0f, 15.496f)
                verticalLineTo(18.497f)
                curveTo(18.0f, 18.774f, 17.776f, 18.998f, 17.5f, 18.998f)
                curveTo(17.224f, 18.998f, 17.0f, 18.774f, 17.0f, 18.497f)
                verticalLineTo(15.496f)
                curveTo(17.0f, 15.219f, 17.224f, 14.995f, 17.5f, 14.995f)
                curveTo(17.776f, 14.995f, 18.0f, 15.219f, 18.0f, 15.496f)
                close()
                moveTo(17.5f, 20.999f)
                curveTo(17.224f, 20.999f, 17.0f, 20.775f, 17.0f, 20.499f)
                curveTo(17.0f, 20.222f, 17.224f, 19.998f, 17.5f, 19.998f)
                curveTo(17.776f, 19.998f, 18.0f, 20.222f, 18.0f, 20.499f)
                curveTo(18.0f, 20.775f, 17.776f, 20.999f, 17.5f, 20.999f)
                close()
            }
        }
        .build()
        return _wiFiWarning!!
    }

@Suppress("ObjectPropertyName")
private var _wiFiWarning: ImageVector? = null

@Preview
@Composable
private fun WiFiWarningPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.WiFiWarning, contentDescription = null)
    }
}

