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

public val FluentIcons.Filled.BinRecycle: ImageVector
    get() {
        if (_BinRecycle != null) {
            return _BinRecycle!!
        }
        _BinRecycle = ImageVector.Builder(
            name = "Filled.BinRecycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.803f, 5.599f)
                curveTo(3.596f, 3.677f, 5.101f, 2f, 7.035f, 2f)
                horizontalLineTo(16.965f)
                curveTo(18.898f, 2f, 20.404f, 3.677f, 20.196f, 5.599f)
                lineTo(18.64f, 19.992f)
                curveTo(18.517f, 21.134f, 17.552f, 22f, 16.403f, 22f)
                horizontalLineTo(7.596f)
                curveTo(6.447f, 22f, 5.483f, 21.134f, 5.359f, 19.992f)
                lineTo(3.803f, 5.599f)
                close()
                moveTo(5.302f, 4.997f)
                horizontalLineTo(18.697f)
                curveTo(18.576f, 4.16f, 17.854f, 3.5f, 16.965f, 3.5f)
                horizontalLineTo(7.035f)
                curveTo(6.145f, 3.5f, 5.423f, 4.16f, 5.302f, 4.997f)
                close()
                moveTo(11.793f, 10.409f)
                curveTo(11.892f, 10.261f, 12.109f, 10.261f, 12.208f, 10.409f)
                lineTo(12.877f, 11.409f)
                curveTo(13.107f, 11.753f, 13.573f, 11.846f, 13.917f, 11.616f)
                curveTo(14.262f, 11.385f, 14.354f, 10.919f, 14.124f, 10.575f)
                lineTo(13.455f, 9.575f)
                curveTo(12.762f, 8.539f, 11.239f, 8.539f, 10.546f, 9.575f)
                lineTo(9.877f, 10.575f)
                curveTo(9.647f, 10.919f, 9.739f, 11.385f, 10.083f, 11.616f)
                curveTo(10.428f, 11.846f, 10.894f, 11.753f, 11.124f, 11.409f)
                lineTo(11.793f, 10.409f)
                close()
                moveTo(9.894f, 13.628f)
                curveTo(10.107f, 13.273f, 9.991f, 12.812f, 9.636f, 12.599f)
                curveTo(9.281f, 12.386f, 8.82f, 12.501f, 8.607f, 12.856f)
                lineTo(8.243f, 13.463f)
                curveTo(7.443f, 14.796f, 8.404f, 16.492f, 9.958f, 16.492f)
                horizontalLineTo(10.75f)
                curveTo(11.165f, 16.492f, 11.5f, 16.156f, 11.5f, 15.742f)
                curveTo(11.5f, 15.328f, 11.165f, 14.992f, 10.75f, 14.992f)
                horizontalLineTo(9.958f)
                curveTo(9.57f, 14.992f, 9.329f, 14.568f, 9.529f, 14.235f)
                lineTo(9.894f, 13.628f)
                close()
                moveTo(14.367f, 12.599f)
                curveTo(14.012f, 12.812f, 13.896f, 13.272f, 14.109f, 13.628f)
                lineTo(14.473f, 14.235f)
                curveTo(14.673f, 14.568f, 14.433f, 14.992f, 14.045f, 14.992f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 14.992f, 12.5f, 15.328f, 12.5f, 15.742f)
                curveTo(12.5f, 16.156f, 12.836f, 16.492f, 13.25f, 16.492f)
                horizontalLineTo(14.045f)
                curveTo(15.598f, 16.492f, 16.559f, 14.797f, 15.76f, 13.464f)
                lineTo(15.396f, 12.857f)
                curveTo(15.183f, 12.501f, 14.723f, 12.386f, 14.367f, 12.599f)
                close()
            }
        }.build()

        return _BinRecycle!!
    }

@Suppress("ObjectPropertyName")
private var _BinRecycle: ImageVector? = null

@Preview
@Composable
private fun BinRecyclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BinRecycle, contentDescription = null)
    }
}
