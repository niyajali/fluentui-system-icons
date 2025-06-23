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

public val FluentIcons.Filled.Trophy: ImageVector
    get() {
        if (_Trophy != null) {
            return _Trophy!!
        }
        _Trophy = ImageVector.Builder(
            name = "Filled.Trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.254f, 2f)
                curveTo(16.412f, 2f, 17.366f, 2.875f, 17.49f, 4f)
                lineTo(18.758f, 4f)
                curveTo(19.676f, 4f, 20.429f, 4.707f, 20.502f, 5.606f)
                lineTo(20.508f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(20.508f, 10.483f, 19.151f, 11.899f, 17.442f, 11.995f)
                lineTo(17.232f, 12.001f)
                curveTo(16.564f, 14.091f, 14.733f, 15.661f, 12.501f, 15.952f)
                lineTo(12.5f, 17.5f)
                horizontalLineTo(14.254f)
                curveTo(15.987f, 17.5f, 17.403f, 18.857f, 17.498f, 20.566f)
                lineTo(17.504f, 20.75f)
                verticalLineTo(21.25f)
                curveTo(17.504f, 21.63f, 17.221f, 21.944f, 16.855f, 21.993f)
                lineTo(16.754f, 22f)
                horizontalLineTo(6.751f)
                curveTo(6.371f, 22f, 6.057f, 21.718f, 6.007f, 21.352f)
                lineTo(6.001f, 21.25f)
                verticalLineTo(20.75f)
                curveTo(6.001f, 19.017f, 7.357f, 17.601f, 9.066f, 17.505f)
                lineTo(9.251f, 17.5f)
                horizontalLineTo(11f)
                lineTo(11f, 15.951f)
                curveTo(8.769f, 15.66f, 6.94f, 14.09f, 6.272f, 12.001f)
                lineTo(6.246f, 12f)
                curveTo(4.451f, 12f, 2.996f, 10.545f, 2.996f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(2.996f, 4.784f, 3.78f, 4f, 4.746f, 4f)
                lineTo(6.014f, 4f)
                curveTo(6.138f, 2.875f, 7.092f, 2f, 8.251f, 2f)
                horizontalLineTo(15.254f)
                close()
                moveTo(18.758f, 5.5f)
                horizontalLineTo(17.504f)
                verticalLineTo(10.483f)
                curveTo(18.304f, 10.37f, 18.93f, 9.717f, 19.001f, 8.904f)
                lineTo(19.008f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(19.008f, 5.632f, 18.925f, 5.533f, 18.815f, 5.507f)
                lineTo(18.758f, 5.5f)
                close()
                moveTo(6.001f, 5.5f)
                horizontalLineTo(4.746f)
                curveTo(4.608f, 5.5f, 4.496f, 5.612f, 4.496f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(4.496f, 9.633f, 5.15f, 10.363f, 6.001f, 10.483f)
                verticalLineTo(5.5f)
                close()
            }
        }.build()

        return _Trophy!!
    }

@Suppress("ObjectPropertyName")
private var _Trophy: ImageVector? = null

@Preview
@Composable
private fun TrophyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Trophy, contentDescription = null)
    }
}
