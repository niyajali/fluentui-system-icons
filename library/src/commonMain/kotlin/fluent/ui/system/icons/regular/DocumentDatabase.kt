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

public val FluentIcons.Regular.DocumentDatabase: ImageVector
    get() {
        if (_DocumentDatabase != null) {
            return _DocumentDatabase!!
        }
        _DocumentDatabase = ImageVector.Builder(
            name = "Regular.DocumentDatabase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.5f, 20f)
                curveTo(18.5f, 20.275f, 18.276f, 20.5f, 18f, 20.5f)
                horizontalLineTo(12f)
                curveTo(12f, 21.081f, 11.791f, 21.58f, 11.467f, 22f)
                horizontalLineTo(18f)
                curveTo(19.104f, 22f, 20f, 21.104f, 20f, 20f)
                verticalLineTo(9.828f)
                curveTo(20f, 9.298f, 19.789f, 8.789f, 19.414f, 8.414f)
                lineTo(13.585f, 2.586f)
                curveTo(13.57f, 2.571f, 13.553f, 2.558f, 13.536f, 2.545f)
                curveTo(13.524f, 2.536f, 13.512f, 2.526f, 13.5f, 2.516f)
                curveTo(13.429f, 2.452f, 13.359f, 2.389f, 13.281f, 2.336f)
                curveTo(13.256f, 2.319f, 13.228f, 2.305f, 13.2f, 2.292f)
                curveTo(13.184f, 2.284f, 13.168f, 2.276f, 13.153f, 2.268f)
                curveTo(13.136f, 2.259f, 13.12f, 2.249f, 13.103f, 2.239f)
                curveTo(13.049f, 2.208f, 12.994f, 2.176f, 12.937f, 2.152f)
                curveTo(12.74f, 2.07f, 12.528f, 2.029f, 12.313f, 2.014f)
                curveTo(12.293f, 2.013f, 12.274f, 2.01f, 12.254f, 2.007f)
                curveTo(12.227f, 2.004f, 12.2f, 2f, 12.172f, 2f)
                horizontalLineTo(6f)
                curveTo(4.896f, 2f, 4f, 2.896f, 4f, 4f)
                verticalLineTo(11.187f)
                curveTo(4.478f, 11.094f, 4.982f, 11.035f, 5.5f, 11.011f)
                verticalLineTo(4f)
                curveTo(5.5f, 3.725f, 5.724f, 3.5f, 6f, 3.5f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                curveTo(12f, 9.104f, 12.896f, 10f, 14f, 10f)
                horizontalLineTo(18.5f)
                verticalLineTo(20f)
                close()
                moveTo(13.5f, 4.621f)
                lineTo(17.378f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.275f, 13.5f, 8f)
                verticalLineTo(4.621f)
                close()
                moveTo(10.408f, 21.681f)
                curveTo(9.564f, 22.466f, 7.907f, 23f, 6f, 23f)
                curveTo(3.95f, 23f, 2.188f, 22.383f, 1.416f, 21.5f)
                curveTo(1.148f, 21.194f, 1f, 20.856f, 1f, 20.5f)
                verticalLineTo(16.492f)
                curveTo(1.31f, 16.762f, 1.663f, 16.985f, 2.017f, 17.162f)
                curveTo(3.088f, 17.698f, 4.498f, 18f, 6f, 18f)
                curveTo(6.514f, 18f, 7.017f, 17.965f, 7.5f, 17.896f)
                curveTo(8.029f, 17.822f, 8.534f, 17.708f, 9f, 17.559f)
                curveTo(9.351f, 17.446f, 9.68f, 17.313f, 9.983f, 17.162f)
                curveTo(10.337f, 16.985f, 10.69f, 16.762f, 11f, 16.492f)
                verticalLineTo(20.5f)
                curveTo(11f, 20.927f, 10.786f, 21.33f, 10.408f, 21.681f)
                close()
                moveTo(5.5f, 12.012f)
                curveTo(5.664f, 12.004f, 5.831f, 12f, 6f, 12f)
                curveTo(6.523f, 12f, 7.026f, 12.04f, 7.5f, 12.114f)
                curveTo(8.046f, 12.2f, 8.552f, 12.332f, 9f, 12.5f)
                curveTo(10.214f, 12.956f, 11f, 13.682f, 11f, 14.5f)
                curveTo(11f, 15.318f, 10.214f, 16.044f, 9f, 16.5f)
                curveTo(8.552f, 16.668f, 8.046f, 16.8f, 7.5f, 16.885f)
                curveTo(7.026f, 16.96f, 6.523f, 17f, 6f, 17f)
                curveTo(3.239f, 17f, 1f, 15.881f, 1f, 14.5f)
                curveTo(1f, 13.475f, 2.234f, 12.594f, 4f, 12.208f)
                curveTo(4.467f, 12.106f, 4.971f, 12.039f, 5.5f, 12.012f)
                close()
            }
        }.build()

        return _DocumentDatabase!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentDatabase: ImageVector? = null

@Preview
@Composable
private fun DocumentDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentDatabase, contentDescription = null)
    }
}
