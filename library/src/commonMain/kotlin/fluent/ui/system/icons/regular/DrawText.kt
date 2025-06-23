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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.DrawText: ImageVector
    get() {
        if (_DrawText != null) {
            return _DrawText!!
        }
        _DrawText = ImageVector.Builder(
            name = "Regular.DrawText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.998f, 5.715f)
                lineTo(7.233f, 13.5f)
                horizontalLineTo(12.763f)
                lineTo(9.998f, 5.715f)
                close()
                moveTo(13.573f, 15.781f)
                lineTo(13.295f, 15f)
                horizontalLineTo(6.7f)
                lineTo(5.456f, 18.504f)
                curveTo(5.317f, 18.895f, 4.888f, 19.099f, 4.498f, 18.96f)
                curveTo(4.108f, 18.821f, 3.904f, 18.393f, 4.042f, 18.002f)
                lineTo(9.16f, 3.592f)
                curveTo(9.44f, 2.803f, 10.556f, 2.803f, 10.836f, 3.592f)
                lineTo(14.748f, 14.607f)
                lineTo(13.573f, 15.781f)
                close()
                moveTo(4.985f, 20.374f)
                curveTo(4.46f, 20.491f, 3.823f, 20.25f, 3.354f, 19.995f)
                curveTo(3.145f, 19.881f, 2.867f, 20.066f, 2.966f, 20.282f)
                curveTo(3.208f, 20.811f, 3.697f, 21.415f, 4.676f, 21.537f)
                curveTo(5.656f, 21.658f, 6.442f, 21.19f, 7.225f, 20.722f)
                curveTo(7.809f, 20.374f, 8.391f, 20.026f, 9.052f, 19.923f)
                curveTo(9.138f, 19.91f, 9.196f, 20.011f, 9.157f, 20.089f)
                curveTo(8.915f, 20.573f, 8.801f, 21.459f, 9.375f, 21.907f)
                curveTo(10.223f, 22.569f, 12.612f, 22.199f, 13.203f, 21.995f)
                curveTo(13.252f, 21.99f, 13.301f, 21.981f, 13.351f, 21.968f)
                lineTo(15.182f, 21.511f)
                curveTo(15.654f, 21.393f, 16.085f, 21.149f, 16.429f, 20.804f)
                lineTo(22.332f, 14.902f)
                curveTo(23.224f, 14.009f, 23.224f, 12.562f, 22.332f, 11.67f)
                curveTo(21.439f, 10.777f, 19.992f, 10.777f, 19.099f, 11.67f)
                lineTo(13.197f, 17.572f)
                curveTo(12.853f, 17.916f, 12.609f, 18.347f, 12.491f, 18.819f)
                lineTo(12.063f, 20.531f)
                curveTo(11.708f, 20.702f, 11.353f, 20.733f, 10.93f, 20.635f)
                curveTo(10.804f, 20.607f, 10.751f, 20.461f, 10.803f, 20.343f)
                curveTo(11.233f, 19.381f, 10.612f, 18.567f, 9.773f, 18.23f)
                curveTo(8.818f, 17.845f, 7.547f, 18.745f, 6.481f, 19.498f)
                curveTo(5.889f, 19.917f, 5.36f, 20.291f, 4.985f, 20.374f)
                close()
            }
        }.build()

        return _DrawText!!
    }

@Suppress("ObjectPropertyName")
private var _DrawText: ImageVector? = null

@Preview
@Composable
private fun DrawTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DrawText, contentDescription = null)
    }
}
