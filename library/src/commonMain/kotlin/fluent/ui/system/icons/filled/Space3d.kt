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
 * Space3d Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent 3D spaces in games or other virtual spaces.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_space_3d_24_filled.svg)
 * 
 * @return The [ImageVector] for the Space3d icon.
 */
public val FluentIcons.Filled.Space3d: ImageVector
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
                verticalLineTo(15.0f)
                horizontalLineTo(20.188f)
                lineTo(17.938f, 12.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.063f)
                lineTo(3.813f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(15.692f, 16.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.545f, 19.545f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(17.083f)
                lineTo(16.716f, 19.776f)
                lineTo(15.692f, 16.5f)
                close()
                moveTo(18.313f, 15.0f)
                horizontalLineTo(15.223f)
                lineTo(14.286f, 12.0f)
                horizontalLineTo(16.063f)
                lineTo(18.313f, 15.0f)
                close()
                moveTo(10.523f, 15.0f)
                horizontalLineTo(13.652f)
                lineTo(12.714f, 12.0f)
                horizontalLineTo(11.273f)
                lineTo(10.523f, 15.0f)
                close()
                moveTo(14.12f, 16.5f)
                horizontalLineTo(10.148f)
                lineTo(9.023f, 21.0f)
                horizontalLineTo(15.517f)
                lineTo(15.283f, 20.22f)
                lineTo(14.12f, 16.5f)
                close()
                moveTo(9.727f, 12.0f)
                lineTo(8.977f, 15.0f)
                horizontalLineTo(5.688f)
                lineTo(7.938f, 12.0f)
                horizontalLineTo(9.727f)
                close()
                moveTo(8.602f, 16.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(7.477f)
                lineTo(8.602f, 16.5f)
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
        Image(imageVector = FluentIcons.Filled.Space3d, contentDescription = "Space3d Icon")
    }
}

