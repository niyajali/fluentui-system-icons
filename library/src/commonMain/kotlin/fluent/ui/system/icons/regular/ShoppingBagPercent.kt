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

public val FluentIcons.Regular.ShoppingBagPercent: ImageVector
    get() {
        if (_ShoppingBagPercent != null) {
            return _ShoppingBagPercent!!
        }
        _ShoppingBagPercent = ImageVector.Builder(
            name = "Regular.ShoppingBagPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(14f, 2f)
                curveTo(15.657f, 2f, 17f, 3.343f, 17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(18.5f)
                curveTo(19.328f, 7f, 20f, 7.672f, 20f, 8.5f)
                verticalLineTo(11.498f)
                curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.732f)
                curveTo(13.949f, 12.02f, 13.444f, 12.383f, 13f, 12.81f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(18f)
                curveTo(5.5f, 19.381f, 6.619f, 20.5f, 8f, 20.5f)
                horizontalLineTo(11.732f)
                curveTo(12.02f, 21.051f, 12.383f, 21.556f, 12.81f, 22f)
                horizontalLineTo(8f)
                curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveTo(7f, 3.343f, 8.343f, 2f, 10f, 2f)
                curveTo(10.768f, 2f, 11.469f, 2.289f, 12f, 2.764f)
                curveTo(12.531f, 2.289f, 13.232f, 2f, 14f, 2f)
                close()
                moveTo(20f, 17.5f)
                curveTo(19.172f, 17.5f, 18.5f, 18.172f, 18.5f, 19f)
                curveTo(18.5f, 19.828f, 19.172f, 20.5f, 20f, 20.5f)
                curveTo(20.828f, 20.5f, 21.5f, 19.828f, 21.5f, 19f)
                curveTo(21.5f, 18.172f, 20.828f, 17.5f, 20f, 17.5f)
                close()
                moveTo(20.33f, 14.672f)
                curveTo(20.135f, 14.477f, 19.818f, 14.477f, 19.623f, 14.672f)
                lineTo(14.673f, 19.622f)
                curveTo(14.478f, 19.817f, 14.478f, 20.134f, 14.673f, 20.329f)
                curveTo(14.868f, 20.524f, 15.185f, 20.524f, 15.38f, 20.329f)
                lineTo(20.33f, 15.379f)
                curveTo(20.525f, 15.184f, 20.525f, 14.867f, 20.33f, 14.672f)
                close()
                moveTo(20f, 18.5f)
                curveTo(20.276f, 18.5f, 20.5f, 18.724f, 20.5f, 19f)
                curveTo(20.5f, 19.276f, 20.276f, 19.5f, 20f, 19.5f)
                curveTo(19.724f, 19.5f, 19.5f, 19.276f, 19.5f, 19f)
                curveTo(19.5f, 18.724f, 19.724f, 18.5f, 20f, 18.5f)
                close()
                moveTo(15f, 14.5f)
                curveTo(14.172f, 14.5f, 13.5f, 15.172f, 13.5f, 16f)
                curveTo(13.5f, 16.828f, 14.172f, 17.5f, 15f, 17.5f)
                curveTo(15.828f, 17.5f, 16.5f, 16.828f, 16.5f, 16f)
                curveTo(16.5f, 15.172f, 15.828f, 14.5f, 15f, 14.5f)
                close()
                moveTo(15f, 15.5f)
                curveTo(15.276f, 15.5f, 15.5f, 15.724f, 15.5f, 16f)
                curveTo(15.5f, 16.276f, 15.276f, 16.5f, 15f, 16.5f)
                curveTo(14.724f, 16.5f, 14.5f, 16.276f, 14.5f, 16f)
                curveTo(14.5f, 15.724f, 14.724f, 15.5f, 15f, 15.5f)
                close()
                moveTo(10f, 3.5f)
                curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(11.5f)
                verticalLineTo(5f)
                curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
                close()
                moveTo(14f, 3.5f)
                curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.845f, 4.044f)
                curveTo(12.946f, 4.344f, 13f, 4.666f, 13f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(15.5f)
                verticalLineTo(5f)
                curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
                close()
            }
        }.build()

        return _ShoppingBagPercent!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBagPercent: ImageVector? = null

@Preview
@Composable
private fun ShoppingBagPercentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShoppingBagPercent, contentDescription = null)
    }
}
