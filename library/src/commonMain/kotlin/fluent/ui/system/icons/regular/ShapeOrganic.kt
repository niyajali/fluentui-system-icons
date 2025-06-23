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

public val FluentIcons.Regular.ShapeOrganic: ImageVector
    get() {
        if (_ShapeOrganic != null) {
            return _ShapeOrganic!!
        }
        _ShapeOrganic = ImageVector.Builder(
            name = "Regular.ShapeOrganic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.852f, 8.946f)
                curveTo(16.503f, 8.659f, 16f, 7.984f, 16f, 6.35f)
                curveTo(16f, 5.278f, 15.659f, 4.432f, 15.12f, 3.788f)
                curveTo(14.592f, 3.156f, 13.908f, 2.758f, 13.27f, 2.503f)
                curveTo(12.63f, 2.248f, 12f, 2.124f, 11.538f, 2.063f)
                curveTo(11.305f, 2.032f, 11.11f, 2.016f, 10.971f, 2.008f)
                curveTo(10.861f, 2.002f, 10.799f, 2f, 10.735f, 2f)
                lineTo(10.734f, 2f)
                curveTo(8.468f, 2f, 6.745f, 2.621f, 5.455f, 3.597f)
                curveTo(4.174f, 4.568f, 3.371f, 5.849f, 2.868f, 7.094f)
                curveTo(2.366f, 8.337f, 2.153f, 9.569f, 2.063f, 10.481f)
                curveTo(1.735f, 13.829f, 2.465f, 17.752f, 5.251f, 19.917f)
                curveTo(7.26f, 21.478f, 9.956f, 22f, 12.75f, 22f)
                curveTo(15.326f, 22f, 17.627f, 21.425f, 19.304f, 20.185f)
                curveTo(21.011f, 18.922f, 22f, 17.02f, 22f, 14.56f)
                curveTo(22f, 12.24f, 20.913f, 10.879f, 19.794f, 10.127f)
                curveTo(19.249f, 9.762f, 18.71f, 9.546f, 18.308f, 9.422f)
                curveTo(17.827f, 9.274f, 17.252f, 9.275f, 16.852f, 8.946f)
                close()
                moveTo(6.172f, 18.733f)
                curveTo(3.776f, 16.871f, 3.276f, 13.484f, 3.556f, 10.628f)
                curveTo(3.637f, 9.806f, 3.827f, 8.725f, 4.259f, 7.656f)
                curveTo(4.69f, 6.588f, 5.351f, 5.557f, 6.361f, 4.793f)
                curveTo(7.622f, 3.838f, 9.316f, 3.416f, 10.885f, 3.506f)
                curveTo(10.993f, 3.512f, 11.15f, 3.524f, 11.341f, 3.55f)
                curveTo(11.726f, 3.601f, 12.225f, 3.702f, 12.715f, 3.897f)
                curveTo(13.205f, 4.092f, 13.651f, 4.369f, 13.969f, 4.75f)
                curveTo(14.277f, 5.118f, 14.5f, 5.622f, 14.5f, 6.35f)
                curveTo(14.5f, 8.316f, 15.123f, 9.466f, 15.899f, 10.104f)
                curveTo(16.274f, 10.412f, 16.652f, 10.573f, 16.941f, 10.656f)
                curveTo(17.245f, 10.744f, 17.562f, 10.762f, 17.865f, 10.855f)
                curveTo(18.167f, 10.949f, 18.564f, 11.108f, 18.957f, 11.373f)
                curveTo(21.562f, 13.123f, 20.637f, 17.333f, 18.412f, 18.979f)
                curveTo(17.078f, 19.965f, 15.129f, 20.5f, 12.75f, 20.5f)
                curveTo(10.1f, 20.5f, 7.799f, 19.997f, 6.172f, 18.733f)
                close()
            }
        }.build()

        return _ShapeOrganic!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeOrganic: ImageVector? = null

@Preview
@Composable
private fun ShapeOrganicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShapeOrganic, contentDescription = null)
    }
}
