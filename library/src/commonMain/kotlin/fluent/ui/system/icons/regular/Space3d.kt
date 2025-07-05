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
 * Space3d Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent 3D spaces in games or other virtual spaces.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_space_3d_24_regular.svg)
 * 
 * @return The [ImageVector] for the Space3d icon.
 */
public val FluentIcons.Regular.Space3d: ImageVector
    get() {
        if (_space3d != null) {
            return _space3d!!
        }
        _space3d = Builder(name = "Space3d", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 14.083f)
                lineTo(5.688f, 12.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(14.083f)
                close()
                moveTo(5.688f, 15.0f)
                horizontalLineTo(8.977f)
                lineTo(9.602f, 12.5f)
                horizontalLineTo(7.563f)
                lineTo(5.688f, 15.0f)
                close()
                moveTo(4.5f, 16.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(7.852f)
                lineTo(8.602f, 16.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(10.148f, 16.5f)
                lineTo(9.398f, 19.5f)
                horizontalLineTo(15.058f)
                lineTo(14.12f, 16.5f)
                horizontalLineTo(10.148f)
                close()
                moveTo(15.692f, 16.5f)
                lineTo(16.629f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(15.692f)
                close()
                moveTo(18.313f, 15.0f)
                lineTo(16.438f, 12.5f)
                horizontalLineTo(14.442f)
                lineTo(15.223f, 15.0f)
                horizontalLineTo(18.313f)
                close()
                moveTo(13.652f, 15.0f)
                lineTo(12.87f, 12.5f)
                horizontalLineTo(11.148f)
                lineTo(10.523f, 15.0f)
                horizontalLineTo(13.652f)
                close()
                moveTo(19.5f, 14.083f)
                verticalLineTo(12.5f)
                horizontalLineTo(18.313f)
                lineTo(19.5f, 14.083f)
                close()
            }
        }
        .build()
        return _space3d!!
    }

@Suppress("ObjectPropertyName")
private var _space3d: ImageVector? = null

@Preview
@Composable
private fun Space3dPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Space3d, contentDescription = "Space3d Icon")
    }
}

