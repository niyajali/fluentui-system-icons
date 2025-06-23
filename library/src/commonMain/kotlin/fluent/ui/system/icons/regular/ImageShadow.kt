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

public val FluentIcons.Regular.ImageShadow: ImageVector
    get() {
        if (_ImageShadow != null) {
            return _ImageShadow!!
        }
        _ImageShadow = ImageVector.Builder(
            name = "Regular.ImageShadow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.996f, 6.748f)
                curveTo(13.996f, 7.438f, 13.438f, 7.996f, 12.748f, 7.996f)
                curveTo(12.059f, 7.996f, 11.5f, 7.438f, 11.5f, 6.748f)
                curveTo(11.5f, 6.059f, 12.059f, 5.5f, 12.748f, 5.5f)
                curveTo(13.438f, 5.5f, 13.996f, 6.059f, 13.996f, 6.748f)
                close()
                moveTo(2f, 5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(14.25f)
                curveTo(16.045f, 2f, 17.5f, 3.455f, 17.5f, 5.25f)
                verticalLineTo(14.25f)
                curveTo(17.5f, 16.045f, 16.045f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 17.5f, 2f, 16.045f, 2f, 14.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(5.25f, 3.5f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(14.25f)
                curveTo(3.5f, 14.481f, 3.545f, 14.701f, 3.626f, 14.903f)
                lineTo(8.213f, 10.613f)
                curveTo(9.078f, 9.804f, 10.422f, 9.804f, 11.287f, 10.613f)
                lineTo(15.874f, 14.904f)
                curveTo(15.955f, 14.702f, 16f, 14.481f, 16f, 14.25f)
                verticalLineTo(5.25f)
                curveTo(16f, 4.284f, 15.217f, 3.5f, 14.25f, 3.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(14.767f, 15.922f)
                lineTo(10.262f, 11.708f)
                curveTo(9.974f, 11.439f, 9.526f, 11.439f, 9.237f, 11.708f)
                lineTo(4.733f, 15.922f)
                curveTo(4.896f, 15.973f, 5.07f, 16f, 5.25f, 16f)
                horizontalLineTo(14.25f)
                curveTo(14.43f, 16f, 14.604f, 15.973f, 14.767f, 15.922f)
                close()
                moveTo(6.499f, 18.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(14.5f)
                curveTo(14.58f, 18.5f, 14.659f, 18.498f, 14.738f, 18.493f)
                curveTo(16.837f, 18.37f, 18.501f, 16.629f, 18.501f, 14.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(18.749f)
                curveTo(20.544f, 6.5f, 21.999f, 7.955f, 21.999f, 9.75f)
                verticalLineTo(16.75f)
                curveTo(21.999f, 19.649f, 19.649f, 22f, 16.749f, 22f)
                horizontalLineTo(9.749f)
                curveTo(7.954f, 22f, 6.499f, 20.545f, 6.499f, 18.75f)
                close()
            }
        }.build()

        return _ImageShadow!!
    }

@Suppress("ObjectPropertyName")
private var _ImageShadow: ImageVector? = null

@Preview
@Composable
private fun ImageShadowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageShadow, contentDescription = null)
    }
}
