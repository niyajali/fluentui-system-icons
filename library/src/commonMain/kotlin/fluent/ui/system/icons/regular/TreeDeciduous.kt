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
 * TreeDeciduous icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tree, deciduous
 * - Source: ic_fluent_tree_deciduous_24_regular.svg
 * 
 * @return The [ImageVector] for the TreeDeciduous icon.
 */
public val FluentIcons.Regular.TreeDeciduous: ImageVector
    get() {
        if (_treeDeciduous != null) {
            return _treeDeciduous!!
        }
        _treeDeciduous = Builder(name = "TreeDeciduous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(10.155f, 2.0f, 8.586f, 3.175f, 7.998f, 4.816f)
                curveTo(6.009f, 5.172f, 4.5f, 6.909f, 4.5f, 9.0f)
                curveTo(4.5f, 9.367f, 4.547f, 9.723f, 4.634f, 10.063f)
                curveTo(3.359f, 10.797f, 2.5f, 12.172f, 2.5f, 13.75f)
                curveTo(2.5f, 15.953f, 4.175f, 17.763f, 6.321f, 17.979f)
                curveTo(6.379f, 17.993f, 6.438f, 18.0f, 6.5f, 18.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(20.25f)
                curveTo(9.5f, 21.216f, 10.283f, 22.0f, 11.25f, 22.0f)
                horizontalLineTo(12.75f)
                curveTo(13.717f, 22.0f, 14.5f, 21.216f, 14.5f, 20.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.5f)
                curveTo(17.562f, 18.0f, 17.621f, 17.993f, 17.679f, 17.979f)
                curveTo(19.825f, 17.763f, 21.5f, 15.953f, 21.5f, 13.75f)
                curveTo(21.5f, 12.172f, 20.64f, 10.797f, 19.366f, 10.063f)
                curveTo(19.453f, 9.723f, 19.5f, 9.367f, 19.5f, 9.0f)
                curveTo(19.5f, 6.909f, 17.991f, 5.172f, 16.002f, 4.816f)
                curveTo(15.414f, 3.175f, 13.845f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 18.0f)
                verticalLineTo(20.25f)
                curveTo(13.0f, 20.388f, 12.888f, 20.5f, 12.75f, 20.5f)
                horizontalLineTo(11.25f)
                curveTo(11.112f, 20.5f, 11.0f, 20.388f, 11.0f, 20.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(6.615f, 16.5f)
                curveTo(6.594f, 16.497f, 6.574f, 16.494f, 6.553f, 16.493f)
                curveTo(5.126f, 16.392f, 4.0f, 15.202f, 4.0f, 13.75f)
                curveTo(4.0f, 12.559f, 4.758f, 11.543f, 5.82f, 11.161f)
                curveTo(6.017f, 11.09f, 6.176f, 10.94f, 6.257f, 10.746f)
                curveTo(6.339f, 10.553f, 6.335f, 10.334f, 6.248f, 10.143f)
                curveTo(6.089f, 9.796f, 6.0f, 9.409f, 6.0f, 9.0f)
                curveTo(6.0f, 7.526f, 7.16f, 6.323f, 8.616f, 6.253f)
                curveTo(8.955f, 6.237f, 9.241f, 5.995f, 9.313f, 5.663f)
                curveTo(9.581f, 4.426f, 10.683f, 3.5f, 12.0f, 3.5f)
                curveTo(13.317f, 3.5f, 14.419f, 4.426f, 14.687f, 5.663f)
                curveTo(14.759f, 5.995f, 15.045f, 6.237f, 15.384f, 6.253f)
                curveTo(16.84f, 6.323f, 18.0f, 7.526f, 18.0f, 9.0f)
                curveTo(18.0f, 9.409f, 17.911f, 9.796f, 17.752f, 10.143f)
                curveTo(17.665f, 10.334f, 17.661f, 10.553f, 17.743f, 10.746f)
                curveTo(17.824f, 10.94f, 17.983f, 11.09f, 18.18f, 11.161f)
                curveTo(19.242f, 11.543f, 20.0f, 12.559f, 20.0f, 13.75f)
                curveTo(20.0f, 15.202f, 18.874f, 16.392f, 17.447f, 16.493f)
                curveTo(17.426f, 16.494f, 17.406f, 16.497f, 17.385f, 16.5f)
                horizontalLineTo(6.615f)
                close()
            }
        }
        .build()
        return _treeDeciduous!!
    }

@Suppress("ObjectPropertyName")
private var _treeDeciduous: ImageVector? = null

@Preview
@Composable
private fun TreeDeciduousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TreeDeciduous, contentDescription = null)
    }
}

