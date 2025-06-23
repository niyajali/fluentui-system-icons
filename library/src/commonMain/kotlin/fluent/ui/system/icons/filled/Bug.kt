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

public val FluentIcons.Filled.Bug: ImageVector
    get() {
        if (_Bug != null) {
            return _Bug!!
        }
        _Bug = ImageVector.Builder(
            name = "Filled.Bug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.25f, 2.002f)
                curveTo(14.63f, 2.002f, 14.943f, 2.284f, 14.993f, 2.65f)
                lineTo(15f, 2.752f)
                verticalLineTo(3.504f)
                curveTo(15f, 4.137f, 14.804f, 4.724f, 14.47f, 5.208f)
                curveTo(15.865f, 5.686f, 16.888f, 6.966f, 16.991f, 8.498f)
                lineTo(17.247f, 8.499f)
                curveTo(18.49f, 8.493f, 19.493f, 7.482f, 19.488f, 6.239f)
                lineTo(19.481f, 4.754f)
                curveTo(19.48f, 4.339f, 19.814f, 4.002f, 20.228f, 4.001f)
                curveTo(20.642f, 3.999f, 20.98f, 4.333f, 20.981f, 4.747f)
                lineTo(20.988f, 6.233f)
                curveTo(20.996f, 8.237f, 19.43f, 9.881f, 17.452f, 9.993f)
                lineTo(17.238f, 9.999f)
                lineTo(17f, 9.998f)
                verticalLineTo(11.5f)
                lineTo(21.253f, 11.501f)
                curveTo(21.632f, 11.501f, 21.946f, 11.783f, 21.996f, 12.149f)
                lineTo(22.003f, 12.251f)
                curveTo(22.003f, 12.63f, 21.721f, 12.944f, 21.355f, 12.994f)
                lineTo(21.253f, 13.001f)
                horizontalLineTo(17f)
                lineTo(17f, 15f)
                lineTo(17.238f, 15.001f)
                lineTo(17.452f, 15.007f)
                curveTo(19.364f, 15.115f, 20.891f, 16.654f, 20.983f, 18.567f)
                lineTo(20.988f, 18.766f)
                lineTo(20.981f, 20.252f)
                curveTo(20.98f, 20.666f, 20.642f, 21f, 20.228f, 20.999f)
                curveTo(19.849f, 20.997f, 19.536f, 20.714f, 19.488f, 20.347f)
                lineTo(19.481f, 20.246f)
                lineTo(19.488f, 18.76f)
                curveTo(19.493f, 17.569f, 18.571f, 16.59f, 17.401f, 16.506f)
                lineTo(17.247f, 16.501f)
                lineTo(16.771f, 16.5f)
                curveTo(16.134f, 18.529f, 14.239f, 20.001f, 12f, 20.001f)
                curveTo(9.761f, 20.001f, 7.866f, 18.529f, 7.229f, 16.5f)
                lineTo(6.741f, 16.501f)
                curveTo(5.498f, 16.506f, 4.495f, 17.517f, 4.5f, 18.76f)
                lineTo(4.506f, 20.246f)
                curveTo(4.508f, 20.66f, 4.174f, 20.997f, 3.759f, 20.999f)
                curveTo(3.345f, 21f, 3.008f, 20.666f, 3.006f, 20.252f)
                lineTo(3f, 18.766f)
                curveTo(2.992f, 16.762f, 4.557f, 15.118f, 6.535f, 15.007f)
                lineTo(6.75f, 15.001f)
                lineTo(7f, 15f)
                verticalLineTo(13f)
                lineTo(2.75f, 13.001f)
                curveTo(2.37f, 13.001f, 2.057f, 12.718f, 2.007f, 12.352f)
                lineTo(2f, 12.251f)
                curveTo(2f, 11.871f, 2.282f, 11.557f, 2.648f, 11.507f)
                lineTo(2.75f, 11.501f)
                lineTo(7f, 11.5f)
                verticalLineTo(9.998f)
                lineTo(6.75f, 9.999f)
                lineTo(6.535f, 9.993f)
                curveTo(4.623f, 9.885f, 3.097f, 8.345f, 3.004f, 6.432f)
                lineTo(3f, 6.233f)
                lineTo(3.006f, 4.747f)
                curveTo(3.008f, 4.333f, 3.345f, 3.999f, 3.759f, 4.001f)
                curveTo(4.139f, 4.002f, 4.452f, 4.286f, 4.5f, 4.652f)
                lineTo(4.506f, 4.754f)
                lineTo(4.5f, 6.239f)
                curveTo(4.495f, 7.43f, 5.416f, 8.409f, 6.587f, 8.493f)
                lineTo(6.741f, 8.499f)
                lineTo(7.009f, 8.498f)
                curveTo(7.112f, 6.966f, 8.135f, 5.686f, 9.531f, 5.207f)
                curveTo(9.233f, 4.777f, 9.045f, 4.266f, 9.007f, 3.713f)
                lineTo(9f, 3.504f)
                verticalLineTo(2.752f)
                curveTo(9f, 2.338f, 9.336f, 2.002f, 9.75f, 2.002f)
                curveTo(10.13f, 2.002f, 10.443f, 2.284f, 10.493f, 2.65f)
                lineTo(10.5f, 2.752f)
                verticalLineTo(3.504f)
                curveTo(10.5f, 4.332f, 11.172f, 5.004f, 12f, 5.004f)
                curveTo(12.78f, 5.004f, 13.42f, 4.409f, 13.493f, 3.649f)
                lineTo(13.5f, 3.504f)
                verticalLineTo(2.752f)
                curveTo(13.5f, 2.338f, 13.836f, 2.002f, 14.25f, 2.002f)
                close()
            }
        }.build()

        return _Bug!!
    }

@Suppress("ObjectPropertyName")
private var _Bug: ImageVector? = null

@Preview
@Composable
private fun BugPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Bug, contentDescription = null)
    }
}
