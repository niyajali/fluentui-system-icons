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

public val FluentIcons.Filled.FoodCake: ImageVector
    get() {
        if (_FoodCake != null) {
            return _FoodCake!!
        }
        _FoodCake = ImageVector.Builder(
            name = "Filled.FoodCake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 7f)
                curveTo(13.714f, 7f, 14f, 5.66f, 14f, 4.556f)
                curveTo(14f, 3.451f, 13.262f, 1.5f, 12f, 1.5f)
                curveTo(10.738f, 1.5f, 10f, 3.451f, 10f, 4.556f)
                curveTo(10f, 5.66f, 10.286f, 7f, 12f, 7f)
                close()
                moveTo(3.5f, 10.25f)
                curveTo(3.5f, 9.007f, 4.507f, 8f, 5.75f, 8f)
                horizontalLineTo(18.25f)
                curveTo(19.493f, 8f, 20.5f, 9.007f, 20.5f, 10.25f)
                verticalLineTo(11.125f)
                lineTo(16.866f, 13.851f)
                curveTo(16.462f, 14.153f, 15.917f, 14.184f, 15.482f, 13.928f)
                lineTo(13.443f, 12.729f)
                curveTo(12.547f, 12.202f, 11.431f, 12.225f, 10.558f, 12.788f)
                lineTo(8.797f, 13.924f)
                curveTo(8.386f, 14.189f, 7.859f, 14.19f, 7.447f, 13.927f)
                lineTo(3.5f, 11.408f)
                verticalLineTo(10.25f)
                close()
                moveTo(3.5f, 13.188f)
                verticalLineTo(18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 18.5f, 2f, 18.836f, 2f, 19.25f)
                curveTo(2f, 19.664f, 2.336f, 20f, 2.75f, 20f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 20f, 22f, 19.664f, 22f, 19.25f)
                curveTo(22f, 18.836f, 21.664f, 18.5f, 21.25f, 18.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(13f)
                lineTo(17.766f, 15.051f)
                curveTo(16.878f, 15.716f, 15.678f, 15.783f, 14.722f, 15.221f)
                lineTo(12.682f, 14.021f)
                curveTo(12.275f, 13.782f, 11.768f, 13.792f, 11.371f, 14.049f)
                lineTo(9.61f, 15.184f)
                curveTo(8.707f, 15.767f, 7.546f, 15.77f, 6.64f, 15.192f)
                lineTo(3.5f, 13.188f)
                close()
            }
        }.build()

        return _FoodCake!!
    }

@Suppress("ObjectPropertyName")
private var _FoodCake: ImageVector? = null

@Preview
@Composable
private fun FoodCakePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FoodCake, contentDescription = null)
    }
}
