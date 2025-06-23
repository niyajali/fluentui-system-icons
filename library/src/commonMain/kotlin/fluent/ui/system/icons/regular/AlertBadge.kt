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

public val FluentIcons.Regular.AlertBadge: ImageVector
    get() {
        if (_AlertBadge != null) {
            return _AlertBadge!!
        }
        _AlertBadge = ImageVector.Builder(
            name = "Regular.AlertBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.988f, 1.996f)
                curveTo(13.435f, 1.996f, 14.788f, 2.403f, 15.935f, 3.111f)
                curveTo(15.593f, 3.476f, 15.329f, 3.914f, 15.168f, 4.4f)
                curveTo(14.246f, 3.826f, 13.155f, 3.496f, 11.988f, 3.496f)
                curveTo(8.663f, 3.496f, 5.98f, 6.169f, 5.979f, 9.494f)
                verticalLineTo(13.903f)
                lineTo(4.634f, 16.996f)
                horizontalLineTo(19.35f)
                lineTo(17.996f, 13.903f)
                lineTo(17.996f, 9.507f)
                lineTo(17.992f, 9.282f)
                curveTo(17.988f, 9.173f, 17.982f, 9.066f, 17.972f, 8.959f)
                curveTo(18.143f, 8.985f, 18.319f, 8.998f, 18.497f, 8.998f)
                curveTo(18.835f, 8.998f, 19.162f, 8.95f, 19.471f, 8.861f)
                curveTo(19.482f, 8.987f, 19.489f, 9.115f, 19.494f, 9.243f)
                lineTo(19.498f, 9.494f)
                verticalLineTo(13.59f)
                lineTo(20.88f, 16.745f)
                curveTo(20.949f, 16.903f, 20.985f, 17.073f, 20.985f, 17.246f)
                curveTo(20.985f, 17.936f, 20.424f, 18.495f, 19.733f, 18.495f)
                lineTo(14.992f, 18.497f)
                curveTo(14.992f, 20.153f, 13.647f, 21.496f, 11.988f, 21.496f)
                curveTo(10.388f, 21.496f, 9.08f, 20.247f, 8.989f, 18.673f)
                lineTo(8.983f, 18.495f)
                lineTo(4.252f, 18.495f)
                curveTo(4.08f, 18.495f, 3.911f, 18.46f, 3.753f, 18.392f)
                curveTo(3.119f, 18.117f, 2.829f, 17.381f, 3.104f, 16.748f)
                lineTo(4.477f, 13.591f)
                verticalLineTo(9.494f)
                curveTo(4.478f, 5.34f, 7.834f, 1.996f, 11.988f, 1.996f)
                close()
                moveTo(13.489f, 18.495f)
                lineTo(10.486f, 18.497f)
                curveTo(10.486f, 19.325f, 11.158f, 19.997f, 11.988f, 19.997f)
                curveTo(12.768f, 19.997f, 13.41f, 19.402f, 13.483f, 18.641f)
                lineTo(13.489f, 18.495f)
                close()
                moveTo(16.033f, 5.053f)
                curveTo(16.128f, 4.526f, 16.389f, 4.056f, 16.76f, 3.699f)
                curveTo(17.21f, 3.266f, 17.822f, 3f, 18.497f, 3f)
                curveTo(19.879f, 3f, 21f, 4.119f, 21f, 5.499f)
                curveTo(21f, 6.592f, 20.297f, 7.521f, 19.319f, 7.86f)
                curveTo(19.061f, 7.95f, 18.785f, 7.998f, 18.497f, 7.998f)
                curveTo(18.248f, 7.998f, 18.008f, 7.962f, 17.782f, 7.895f)
                curveTo(16.747f, 7.588f, 15.993f, 6.631f, 15.993f, 5.499f)
                curveTo(15.993f, 5.347f, 16.007f, 5.197f, 16.033f, 5.053f)
                close()
            }
        }.build()

        return _AlertBadge!!
    }

@Suppress("ObjectPropertyName")
private var _AlertBadge: ImageVector? = null

@Preview
@Composable
private fun AlertBadgePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.AlertBadge, contentDescription = null)
    }
}
