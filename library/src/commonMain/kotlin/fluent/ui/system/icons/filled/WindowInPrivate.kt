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
 * WindowInPrivate Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_inprivate_20_filled.svg)
 * 
 * @return The [ImageVector] for the WindowInPrivate icon.
 */
public val FluentIcons.Filled.WindowInPrivate: ImageVector
    get() {
        if (_windowInPrivate != null) {
            return _windowInPrivate!!
        }
        _windowInPrivate = Builder(name = "WindowInPrivate", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.498f, 3.001f)
                curveTo(4.117f, 3.001f, 2.998f, 4.12f, 2.998f, 5.501f)
                verticalLineTo(14.501f)
                curveTo(2.998f, 15.882f, 4.117f, 17.001f, 5.498f, 17.001f)
                horizontalLineTo(14.498f)
                curveTo(15.879f, 17.001f, 16.998f, 15.882f, 16.998f, 14.501f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.001f)
                verticalLineTo(6.5f)
                horizontalLineTo(16.998f)
                verticalLineTo(5.501f)
                curveTo(16.998f, 4.12f, 15.879f, 3.001f, 14.498f, 3.001f)
                horizontalLineTo(5.498f)
                close()
                moveTo(15.5f, 6.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(14.21f)
                lineTo(15.355f, 5.355f)
                curveTo(15.448f, 5.55f, 15.5f, 5.769f, 15.5f, 6.0f)
                close()
                moveTo(14.649f, 4.647f)
                lineTo(12.795f, 6.5f)
                horizontalLineTo(9.967f)
                lineTo(11.967f, 4.5f)
                horizontalLineTo(14.0f)
                curveTo(14.233f, 4.5f, 14.452f, 4.553f, 14.649f, 4.647f)
                close()
                moveTo(10.553f, 4.5f)
                lineTo(8.553f, 6.5f)
                horizontalLineTo(5.724f)
                lineTo(7.724f, 4.5f)
                horizontalLineTo(10.553f)
                close()
                moveTo(6.31f, 4.5f)
                lineTo(4.5f, 6.31f)
                verticalLineTo(6.0f)
                curveTo(4.5f, 5.172f, 5.172f, 4.5f, 6.0f, 4.5f)
                horizontalLineTo(6.31f)
                close()
                moveTo(7.053f, 8.0f)
                lineTo(4.5f, 10.552f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.053f)
                close()
                moveTo(4.5f, 11.966f)
                lineTo(8.467f, 8.0f)
                horizontalLineTo(11.295f)
                lineTo(4.647f, 14.648f)
                curveTo(4.553f, 14.452f, 4.5f, 14.232f, 4.5f, 14.0f)
                verticalLineTo(11.966f)
                close()
                moveTo(12.71f, 8.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.037f)
                lineTo(8.038f, 15.5f)
                horizontalLineTo(6.0f)
                curveTo(5.769f, 15.5f, 5.551f, 15.448f, 5.355f, 15.354f)
                lineTo(12.71f, 8.0f)
                close()
                moveTo(15.5f, 9.452f)
                verticalLineTo(12.28f)
                lineTo(12.281f, 15.5f)
                horizontalLineTo(9.452f)
                lineTo(15.5f, 9.452f)
                close()
                moveTo(15.5f, 13.694f)
                verticalLineTo(14.0f)
                curveTo(15.5f, 14.828f, 14.829f, 15.5f, 14.0f, 15.5f)
                horizontalLineTo(13.695f)
                lineTo(15.5f, 13.694f)
                close()
            }
        }
        .build()
        return _windowInPrivate!!
    }

@Suppress("ObjectPropertyName")
private var _windowInPrivate: ImageVector? = null

@Preview
@Composable
private fun WindowInPrivatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowInPrivate, contentDescription = "WindowInPrivate Icon")
    }
}

