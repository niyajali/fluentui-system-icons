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

public val FluentIcons.Regular.SurfaceEarbuds: ImageVector
    get() {
        if (_SurfaceEarbuds != null) {
            return _SurfaceEarbuds!!
        }
        _SurfaceEarbuds = ImageVector.Builder(
            name = "Regular.SurfaceEarbuds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17f, 10f)
                curveTo(20.314f, 10f, 23f, 12.686f, 23f, 16f)
                curveTo(23f, 19.314f, 20.314f, 22f, 17f, 22f)
                curveTo(16.415f, 22f, 15.85f, 21.916f, 15.316f, 21.76f)
                curveTo(15.172f, 21.831f, 15.026f, 21.892f, 14.882f, 21.941f)
                lineTo(14.673f, 22.006f)
                lineTo(12.059f, 22.874f)
                curveTo(10.915f, 23.253f, 9.666f, 22.843f, 8.967f, 21.878f)
                lineTo(8.866f, 21.73f)
                lineTo(8.435f, 21.046f)
                curveTo(7.807f, 20.049f, 7.887f, 18.77f, 8.615f, 17.861f)
                lineTo(8.743f, 17.713f)
                lineTo(10.714f, 15.582f)
                curveTo(10.818f, 15.468f, 10.929f, 15.359f, 11.045f, 15.258f)
                curveTo(11.411f, 12.295f, 13.937f, 10f, 17f, 10f)
                close()
                moveTo(11.146f, 17.323f)
                lineTo(9.844f, 18.731f)
                curveTo(9.492f, 19.112f, 9.415f, 19.666f, 9.636f, 20.124f)
                lineTo(9.704f, 20.247f)
                lineTo(10.135f, 20.93f)
                curveTo(10.418f, 21.379f, 10.95f, 21.597f, 11.46f, 21.485f)
                lineTo(11.586f, 21.45f)
                lineTo(13.444f, 20.834f)
                curveTo(12.302f, 19.992f, 11.469f, 18.754f, 11.146f, 17.323f)
                close()
                moveTo(17f, 11.5f)
                curveTo(15.154f, 11.5f, 13.567f, 12.612f, 12.873f, 14.202f)
                lineTo(12.809f, 14.359f)
                lineTo(12.725f, 14.593f)
                lineTo(12.653f, 14.833f)
                curveTo(12.604f, 15.014f, 12.567f, 15.2f, 12.541f, 15.389f)
                lineTo(12.512f, 15.675f)
                curveTo(12.504f, 15.783f, 12.5f, 15.891f, 12.5f, 16f)
                lineTo(12.505f, 16.212f)
                curveTo(12.585f, 17.944f, 13.645f, 19.42f, 15.143f, 20.1f)
                lineTo(15.144f, 20.099f)
                curveTo(15.301f, 20.171f, 15.463f, 20.233f, 15.629f, 20.287f)
                lineTo(15.721f, 20.314f)
                lineTo(15.871f, 20.357f)
                curveTo(15.989f, 20.388f, 16.109f, 20.413f, 16.231f, 20.434f)
                lineTo(16.415f, 20.462f)
                curveTo(16.5f, 20.473f, 16.586f, 20.482f, 16.672f, 20.488f)
                curveTo(16.755f, 20.494f, 16.838f, 20.498f, 16.923f, 20.499f)
                lineTo(17f, 20.5f)
                curveTo(19.485f, 20.5f, 21.5f, 18.485f, 21.5f, 16f)
                curveTo(21.5f, 13.515f, 19.485f, 11.5f, 17f, 11.5f)
                close()
                moveTo(7f, 1f)
                curveTo(7.753f, 1f, 8.474f, 1.139f, 9.139f, 1.392f)
                lineTo(9.936f, 1.137f)
                curveTo(10.976f, 0.804f, 12.107f, 1.119f, 12.824f, 1.921f)
                lineTo(12.947f, 2.068f)
                lineTo(13.08f, 2.256f)
                lineTo(13.605f, 3.061f)
                curveTo(14.218f, 4.003f, 14.192f, 5.214f, 13.545f, 6.145f)
                lineTo(13.425f, 6.306f)
                lineTo(13.29f, 6.46f)
                lineTo(12.996f, 6.768f)
                lineTo(13f, 7f)
                curveTo(13f, 10.314f, 10.314f, 13f, 7f, 13f)
                curveTo(3.686f, 13f, 1f, 10.314f, 1f, 7f)
                curveTo(1f, 3.686f, 3.686f, 1f, 7f, 1f)
                close()
                moveTo(5.73f, 2.682f)
                lineTo(5.578f, 2.729f)
                curveTo(3.789f, 3.325f, 2.5f, 5.012f, 2.5f, 7f)
                curveTo(2.5f, 9.485f, 4.515f, 11.5f, 7f, 11.5f)
                curveTo(8.894f, 11.5f, 10.514f, 10.33f, 11.179f, 8.674f)
                curveTo(10.924f, 8.941f, 10.639f, 9.175f, 10.325f, 9.37f)
                curveTo(8.407f, 10.567f, 5.866f, 10.024f, 4.645f, 8.148f)
                curveTo(3.46f, 6.328f, 3.957f, 3.927f, 5.73f, 2.682f)
                close()
                moveTo(10.532f, 2.53f)
                lineTo(10.394f, 2.566f)
                lineTo(7.441f, 3.511f)
                curveTo(7.187f, 3.579f, 6.944f, 3.685f, 6.717f, 3.826f)
                curveTo(5.496f, 4.587f, 5.136f, 6.153f, 5.902f, 7.33f)
                curveTo(6.675f, 8.517f, 8.302f, 8.864f, 9.532f, 8.098f)
                curveTo(9.685f, 8.002f, 9.829f, 7.891f, 9.963f, 7.766f)
                lineTo(10.093f, 7.637f)
                lineTo(12.183f, 5.448f)
                lineTo(12.276f, 5.343f)
                curveTo(12.584f, 4.959f, 12.635f, 4.43f, 12.415f, 3.996f)
                lineTo(12.347f, 3.88f)
                lineTo(11.841f, 3.1f)
                lineTo(11.757f, 2.983f)
                lineTo(11.677f, 2.89f)
                curveTo(11.416f, 2.617f, 11.045f, 2.479f, 10.672f, 2.51f)
                lineTo(10.532f, 2.53f)
                close()
                moveTo(10.93f, 3.684f)
                lineTo(10.998f, 3.771f)
                lineTo(11.248f, 4.145f)
                curveTo(11.479f, 4.489f, 11.386f, 4.955f, 11.042f, 5.185f)
                curveTo(10.729f, 5.395f, 10.316f, 5.337f, 10.07f, 5.067f)
                lineTo(10.002f, 4.979f)
                lineTo(9.752f, 4.606f)
                curveTo(9.521f, 4.261f, 9.614f, 3.796f, 9.958f, 3.565f)
                curveTo(10.271f, 3.356f, 10.684f, 3.413f, 10.93f, 3.684f)
                close()
            }
        }.build()

        return _SurfaceEarbuds!!
    }

@Suppress("ObjectPropertyName")
private var _SurfaceEarbuds: ImageVector? = null

@Preview
@Composable
private fun SurfaceEarbudsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SurfaceEarbuds, contentDescription = null)
    }
}
