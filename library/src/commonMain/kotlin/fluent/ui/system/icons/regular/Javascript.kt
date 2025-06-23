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

public val FluentIcons.Regular.Javascript: ImageVector
    get() {
        if (_Javascript != null) {
            return _Javascript!!
        }
        _Javascript = ImageVector.Builder(
            name = "Regular.Javascript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 11.25f)
                curveTo(14f, 10.283f, 14.783f, 9.5f, 15.75f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.5f, 18f, 9.836f, 18f, 10.25f)
                curveTo(18f, 10.664f, 17.664f, 11f, 17.25f, 11f)
                horizontalLineTo(15.75f)
                curveTo(15.612f, 11f, 15.5f, 11.112f, 15.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 12.888f, 15.612f, 13f, 15.75f, 13f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 13f, 18f, 13.783f, 18f, 14.75f)
                verticalLineTo(16.25f)
                curveTo(18f, 17.216f, 17.216f, 18f, 16.25f, 18f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 18f, 14f, 17.664f, 14f, 17.25f)
                curveTo(14f, 16.836f, 14.336f, 16.5f, 14.75f, 16.5f)
                horizontalLineTo(16.25f)
                curveTo(16.388f, 16.5f, 16.5f, 16.388f, 16.5f, 16.25f)
                verticalLineTo(14.75f)
                curveTo(16.5f, 14.612f, 16.388f, 14.5f, 16.25f, 14.5f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 14.5f, 14f, 13.717f, 14f, 12.75f)
                verticalLineTo(11.25f)
                close()
                moveTo(12.75f, 10.25f)
                curveTo(12.75f, 9.836f, 12.414f, 9.5f, 12f, 9.5f)
                curveTo(11.586f, 9.5f, 11.25f, 9.836f, 11.25f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 16.388f, 11.138f, 16.5f, 11f, 16.5f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 16.5f, 9f, 16.836f, 9f, 17.25f)
                curveTo(9f, 17.664f, 9.336f, 18f, 9.75f, 18f)
                horizontalLineTo(11f)
                curveTo(11.967f, 18f, 12.75f, 17.216f, 12.75f, 16.25f)
                verticalLineTo(10.25f)
                close()
                moveTo(3f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                close()
                moveTo(6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                close()
            }
        }.build()

        return _Javascript!!
    }

@Suppress("ObjectPropertyName")
private var _Javascript: ImageVector? = null

@Preview
@Composable
private fun JavascriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Javascript, contentDescription = null)
    }
}
