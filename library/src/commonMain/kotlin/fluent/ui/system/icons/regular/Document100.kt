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

public val FluentIcons.Regular.Document100: ImageVector
    get() {
        if (_Document100 != null) {
            return _Document100!!
        }
        _Document100 = ImageVector.Builder(
            name = "Regular.Document100",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 4f)
                curveTo(4f, 2.895f, 4.896f, 2f, 6f, 2f)
                horizontalLineTo(12.172f)
                curveTo(12.703f, 2f, 13.212f, 2.211f, 13.587f, 2.586f)
                lineTo(19.414f, 8.414f)
                curveTo(19.789f, 8.789f, 20f, 9.297f, 20f, 9.828f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(15.95f)
                curveTo(16.368f, 21.59f, 16.684f, 21.076f, 16.855f, 20.5f)
                horizontalLineTo(18f)
                curveTo(18.276f, 20.5f, 18.5f, 20.276f, 18.5f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.896f, 10f, 12f, 9.105f, 12f, 8f)
                verticalLineTo(3.5f)
                horizontalLineTo(6f)
                curveTo(5.724f, 3.5f, 5.5f, 3.724f, 5.5f, 4f)
                verticalLineTo(14.627f)
                curveTo(5.265f, 14.792f, 5.051f, 14.984f, 4.862f, 15.199f)
                curveTo(4.679f, 14.742f, 4.338f, 14.425f, 4f, 14.228f)
                verticalLineTo(4f)
                close()
                moveTo(13.5f, 4.621f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(17.379f)
                lineTo(13.5f, 4.621f)
                close()
                moveTo(4f, 15.938f)
                curveTo(4f, 15.376f, 3.567f, 15.074f, 3.258f, 14.987f)
                curveTo(2.949f, 14.9f, 2.454f, 14.931f, 2.147f, 15.358f)
                curveTo(1.83f, 15.801f, 1.388f, 16.297f, 0.868f, 16.604f)
                curveTo(0.512f, 16.815f, 0.394f, 17.275f, 0.605f, 17.632f)
                curveTo(0.816f, 17.988f, 1.276f, 18.106f, 1.632f, 17.896f)
                curveTo(1.955f, 17.704f, 2.245f, 17.474f, 2.5f, 17.233f)
                verticalLineTo(21.25f)
                curveTo(2.5f, 21.664f, 2.836f, 22f, 3.25f, 22f)
                curveTo(3.664f, 22f, 4f, 21.664f, 4f, 21.25f)
                verticalLineTo(15.938f)
                close()
                moveTo(5f, 17.5f)
                curveTo(5f, 16.119f, 6.119f, 15f, 7.5f, 15f)
                curveTo(8.881f, 15f, 10f, 16.119f, 10f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(10f, 20.881f, 8.881f, 22f, 7.5f, 22f)
                curveTo(6.119f, 22f, 5f, 20.881f, 5f, 19.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(7.5f, 16.5f)
                curveTo(6.948f, 16.5f, 6.5f, 16.948f, 6.5f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(6.5f, 20.052f, 6.948f, 20.5f, 7.5f, 20.5f)
                curveTo(8.052f, 20.5f, 8.5f, 20.052f, 8.5f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(8.5f, 16.948f, 8.052f, 16.5f, 7.5f, 16.5f)
                close()
                moveTo(13.5f, 15f)
                curveTo(12.119f, 15f, 11f, 16.119f, 11f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(11f, 20.881f, 12.119f, 22f, 13.5f, 22f)
                curveTo(14.881f, 22f, 16f, 20.881f, 16f, 19.5f)
                verticalLineTo(17.5f)
                curveTo(16f, 16.119f, 14.881f, 15f, 13.5f, 15f)
                close()
                moveTo(12.5f, 17.5f)
                curveTo(12.5f, 16.948f, 12.948f, 16.5f, 13.5f, 16.5f)
                curveTo(14.052f, 16.5f, 14.5f, 16.948f, 14.5f, 17.5f)
                verticalLineTo(19.5f)
                curveTo(14.5f, 20.052f, 14.052f, 20.5f, 13.5f, 20.5f)
                curveTo(12.948f, 20.5f, 12.5f, 20.052f, 12.5f, 19.5f)
                verticalLineTo(17.5f)
                close()
            }
        }.build()

        return _Document100!!
    }

@Suppress("ObjectPropertyName")
private var _Document100: ImageVector? = null

@Preview
@Composable
private fun Document100Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Document100, contentDescription = null)
    }
}
