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

public val FluentIcons.Filled.GlassesOff: ImageVector
    get() {
        if (_GlassesOff != null) {
            return _GlassesOff!!
        }
        _GlassesOff = ImageVector.Builder(
            name = "Filled.GlassesOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(5.493f, 6.554f)
                lineTo(2.628f, 9.673f)
                lineTo(2.584f, 9.725f)
                lineTo(2.546f, 9.78f)
                curveTo(2.206f, 10.174f, 2f, 10.688f, 2f, 11.25f)
                verticalLineTo(14.746f)
                curveTo(2f, 16.541f, 3.455f, 17.996f, 5.25f, 17.996f)
                horizontalLineTo(7.749f)
                curveTo(9.544f, 17.996f, 10.999f, 16.541f, 10.999f, 14.746f)
                lineTo(10.998f, 12.504f)
                horizontalLineTo(11.443f)
                lineTo(13f, 14.061f)
                lineTo(13f, 14.746f)
                curveTo(13f, 16.541f, 14.455f, 17.996f, 16.25f, 17.996f)
                horizontalLineTo(16.935f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                close()
                moveTo(7.939f, 8.999f)
                lineTo(5.283f, 8.999f)
                lineTo(6.555f, 7.615f)
                lineTo(7.939f, 8.999f)
                close()
                moveTo(13.303f, 10.121f)
                lineTo(20.6f, 17.418f)
                curveTo(21.445f, 16.831f, 21.999f, 15.853f, 21.999f, 14.746f)
                verticalLineTo(11.25f)
                curveTo(21.999f, 10.72f, 21.816f, 10.233f, 21.51f, 9.849f)
                curveTo(21.479f, 9.786f, 21.438f, 9.726f, 21.388f, 9.671f)
                lineTo(17.746f, 5.724f)
                lineTo(17.613f, 5.592f)
                curveTo(17.2f, 5.213f, 16.658f, 5f, 16.093f, 5f)
                horizontalLineTo(15.25f)
                lineTo(15.148f, 5.007f)
                curveTo(14.782f, 5.057f, 14.5f, 5.37f, 14.5f, 5.75f)
                curveTo(14.5f, 6.164f, 14.836f, 6.5f, 15.25f, 6.5f)
                horizontalLineTo(16.093f)
                lineTo(16.196f, 6.507f)
                curveTo(16.367f, 6.531f, 16.525f, 6.613f, 16.644f, 6.741f)
                lineTo(18.727f, 8.999f)
                lineTo(15.25f, 9f)
                curveTo(14.419f, 9f, 13.693f, 9.451f, 13.303f, 10.121f)
                close()
            }
        }.build()

        return _GlassesOff!!
    }

@Suppress("ObjectPropertyName")
private var _GlassesOff: ImageVector? = null

@Preview
@Composable
private fun GlassesOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlassesOff, contentDescription = null)
    }
}
