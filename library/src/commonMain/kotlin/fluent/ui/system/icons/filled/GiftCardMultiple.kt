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

public val FluentIcons.Filled.GiftCardMultiple: ImageVector
    get() {
        if (_GiftCardMultiple != null) {
            return _GiftCardMultiple!!
        }
        _GiftCardMultiple = ImageVector.Builder(
            name = "Filled.GiftCardMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(6.708f)
                curveTo(7.694f, 6.574f, 7.356f, 6.5f, 7f, 6.5f)
                curveTo(5.619f, 6.5f, 4.5f, 7.619f, 4.5f, 9f)
                curveTo(4.5f, 9.356f, 4.574f, 9.694f, 4.708f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                curveTo(2f, 5.343f, 3.343f, 4f, 5f, 4f)
                close()
                moveTo(2f, 14.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.939f)
                lineTo(5.22f, 13.22f)
                curveTo(4.927f, 13.513f, 4.927f, 13.987f, 5.22f, 14.28f)
                curveTo(5.513f, 14.573f, 5.987f, 14.573f, 6.28f, 14.28f)
                lineTo(8f, 12.561f)
                verticalLineTo(17.5f)
                horizontalLineTo(5f)
                curveTo(3.343f, 17.5f, 2f, 16.157f, 2f, 14.5f)
                close()
                moveTo(9.5f, 17.5f)
                horizontalLineTo(16.5f)
                curveTo(18.157f, 17.5f, 19.5f, 16.157f, 19.5f, 14.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(10.561f)
                lineTo(12.28f, 13.22f)
                curveTo(12.573f, 13.513f, 12.573f, 13.987f, 12.28f, 14.28f)
                curveTo(11.987f, 14.573f, 11.513f, 14.573f, 11.22f, 14.28f)
                lineTo(9.5f, 12.561f)
                verticalLineTo(17.5f)
                close()
                moveTo(12.792f, 10f)
                horizontalLineTo(19.5f)
                verticalLineTo(7f)
                curveTo(19.5f, 5.343f, 18.157f, 4f, 16.5f, 4f)
                horizontalLineTo(9.5f)
                verticalLineTo(6.708f)
                curveTo(9.806f, 6.574f, 10.144f, 6.5f, 10.5f, 6.5f)
                curveTo(11.881f, 6.5f, 13f, 7.619f, 13f, 9f)
                curveTo(13f, 9.356f, 12.926f, 9.694f, 12.792f, 10f)
                close()
                moveTo(10.5f, 10f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                curveTo(9.5f, 8.448f, 9.948f, 8f, 10.5f, 8f)
                curveTo(11.052f, 8f, 11.5f, 8.448f, 11.5f, 9f)
                curveTo(11.5f, 9.552f, 11.052f, 10f, 10.5f, 10f)
                close()
                moveTo(7f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(8.992f)
                curveTo(7.996f, 8.444f, 7.55f, 8f, 7f, 8f)
                curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
                curveTo(6f, 9.552f, 6.448f, 10f, 7f, 10f)
                close()
                moveTo(7.5f, 20f)
                curveTo(6.39f, 20f, 5.42f, 19.397f, 4.901f, 18.5f)
                horizontalLineTo(16.5f)
                curveTo(18.709f, 18.5f, 20.5f, 16.709f, 20.5f, 14.5f)
                verticalLineTo(6.901f)
                curveTo(21.397f, 7.42f, 22f, 8.39f, 22f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(22f, 17.538f, 19.538f, 20f, 16.5f, 20f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()

        return _GiftCardMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _GiftCardMultiple: ImageVector? = null

@Preview
@Composable
private fun GiftCardMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GiftCardMultiple, contentDescription = null)
    }
}
