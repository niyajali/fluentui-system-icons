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

public val FluentIcons.Regular.Lasso: ImageVector
    get() {
        if (_Lasso != null) {
            return _Lasso!!
        }
        _Lasso = ImageVector.Builder(
            name = "Regular.Lasso",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.703f, 2.265f)
                curveTo(10.441f, 2.092f, 11.21f, 2f, 12f, 2f)
                curveTo(12.79f, 2f, 13.559f, 2.092f, 14.297f, 2.265f)
                curveTo(14.7f, 2.36f, 14.95f, 2.764f, 14.856f, 3.167f)
                curveTo(14.761f, 3.57f, 14.357f, 3.82f, 13.954f, 3.725f)
                curveTo(13.327f, 3.578f, 12.673f, 3.5f, 12f, 3.5f)
                curveTo(11.327f, 3.5f, 10.673f, 3.578f, 10.046f, 3.725f)
                curveTo(9.643f, 3.82f, 9.239f, 3.57f, 9.144f, 3.167f)
                curveTo(9.05f, 2.764f, 9.3f, 2.36f, 9.703f, 2.265f)
                close()
                moveTo(7.773f, 3.736f)
                curveTo(7.992f, 4.088f, 7.883f, 4.55f, 7.531f, 4.768f)
                curveTo(6.41f, 5.462f, 5.462f, 6.41f, 4.768f, 7.531f)
                curveTo(4.55f, 7.883f, 4.088f, 7.992f, 3.736f, 7.773f)
                curveTo(3.384f, 7.555f, 3.275f, 7.093f, 3.493f, 6.741f)
                curveTo(4.309f, 5.423f, 5.423f, 4.309f, 6.741f, 3.493f)
                curveTo(7.093f, 3.275f, 7.555f, 3.384f, 7.773f, 3.736f)
                close()
                moveTo(16.226f, 3.736f)
                curveTo(16.445f, 3.384f, 16.907f, 3.275f, 17.259f, 3.493f)
                curveTo(18.577f, 4.309f, 19.691f, 5.423f, 20.507f, 6.741f)
                curveTo(20.725f, 7.093f, 20.616f, 7.555f, 20.264f, 7.773f)
                curveTo(19.912f, 7.992f, 19.45f, 7.883f, 19.232f, 7.531f)
                curveTo(18.538f, 6.41f, 17.59f, 5.462f, 16.469f, 4.768f)
                curveTo(16.117f, 4.55f, 16.008f, 4.088f, 16.226f, 3.736f)
                close()
                moveTo(3.167f, 9.144f)
                curveTo(3.57f, 9.239f, 3.82f, 9.643f, 3.725f, 10.046f)
                curveTo(3.578f, 10.673f, 3.5f, 11.327f, 3.5f, 12f)
                curveTo(3.5f, 12.673f, 3.578f, 13.327f, 3.725f, 13.954f)
                curveTo(3.82f, 14.357f, 3.57f, 14.761f, 3.167f, 14.856f)
                curveTo(2.764f, 14.95f, 2.36f, 14.7f, 2.265f, 14.297f)
                curveTo(2.092f, 13.559f, 2f, 12.79f, 2f, 12f)
                curveTo(2f, 11.21f, 2.092f, 10.441f, 2.265f, 9.703f)
                curveTo(2.36f, 9.3f, 2.764f, 9.05f, 3.167f, 9.144f)
                close()
                moveTo(20.833f, 9.144f)
                curveTo(21.236f, 9.05f, 21.64f, 9.3f, 21.735f, 9.703f)
                curveTo(21.908f, 10.441f, 22f, 11.21f, 22f, 12f)
                curveTo(22f, 12.79f, 21.908f, 13.559f, 21.735f, 14.297f)
                curveTo(21.64f, 14.7f, 21.236f, 14.95f, 20.833f, 14.856f)
                curveTo(20.43f, 14.761f, 20.18f, 14.357f, 20.274f, 13.954f)
                curveTo(20.422f, 13.327f, 20.5f, 12.673f, 20.5f, 12f)
                curveTo(20.5f, 11.327f, 20.422f, 10.673f, 20.274f, 10.046f)
                curveTo(20.18f, 9.643f, 20.43f, 9.239f, 20.833f, 9.144f)
                close()
                moveTo(3.736f, 16.226f)
                curveTo(4.088f, 16.008f, 4.55f, 16.117f, 4.768f, 16.469f)
                curveTo(5.462f, 17.59f, 6.41f, 18.538f, 7.531f, 19.232f)
                curveTo(7.883f, 19.45f, 7.992f, 19.912f, 7.773f, 20.264f)
                curveTo(7.555f, 20.616f, 7.093f, 20.725f, 6.741f, 20.507f)
                curveTo(5.423f, 19.691f, 4.309f, 18.577f, 3.493f, 17.259f)
                curveTo(3.275f, 16.907f, 3.384f, 16.445f, 3.736f, 16.226f)
                close()
                moveTo(20.421f, 17.085f)
                curveTo(20.606f, 16.715f, 20.456f, 16.264f, 20.086f, 16.079f)
                curveTo(19.715f, 15.894f, 19.265f, 16.045f, 19.079f, 16.415f)
                lineTo(19.077f, 16.419f)
                lineTo(19.062f, 16.448f)
                curveTo(19.048f, 16.475f, 19.025f, 16.516f, 18.993f, 16.571f)
                curveTo(18.931f, 16.681f, 18.834f, 16.842f, 18.704f, 17.037f)
                curveTo(18.479f, 17.375f, 18.157f, 17.809f, 17.739f, 18.256f)
                curveTo(16.569f, 17.183f, 14.983f, 16.25f, 13f, 16.25f)
                curveTo(10.652f, 16.25f, 9.01f, 17.453f, 9.01f, 19.125f)
                curveTo(9.01f, 20.797f, 10.652f, 22f, 13f, 22f)
                curveTo(14.941f, 22f, 16.494f, 21.25f, 17.657f, 20.354f)
                curveTo(18.091f, 20.886f, 18.429f, 21.406f, 18.667f, 21.81f)
                curveTo(18.803f, 22.041f, 18.905f, 22.233f, 18.972f, 22.364f)
                curveTo(19.005f, 22.43f, 19.03f, 22.48f, 19.045f, 22.514f)
                lineTo(19.062f, 22.549f)
                lineTo(19.066f, 22.558f)
                curveTo(19.236f, 22.935f, 19.679f, 23.104f, 20.057f, 22.934f)
                curveTo(20.435f, 22.765f, 20.604f, 22.321f, 20.434f, 21.943f)
                curveTo(20.347f, 21.76f, 20.434f, 21.942f, 20.434f, 21.942f)
                lineTo(20.433f, 21.94f)
                lineTo(20.431f, 21.936f)
                lineTo(20.424f, 21.92f)
                curveTo(20.418f, 21.908f, 20.41f, 21.89f, 20.4f, 21.869f)
                curveTo(20.379f, 21.825f, 20.348f, 21.763f, 20.309f, 21.685f)
                curveTo(20.23f, 21.529f, 20.113f, 21.31f, 19.96f, 21.05f)
                curveTo(19.685f, 20.583f, 19.289f, 19.973f, 18.771f, 19.347f)
                curveTo(19.288f, 18.805f, 19.681f, 18.276f, 19.952f, 17.869f)
                curveTo(20.103f, 17.642f, 20.218f, 17.452f, 20.296f, 17.316f)
                curveTo(20.335f, 17.247f, 20.365f, 17.192f, 20.385f, 17.153f)
                curveTo(20.396f, 17.134f, 20.404f, 17.118f, 20.41f, 17.107f)
                lineTo(20.417f, 17.093f)
                lineTo(20.419f, 17.088f)
                lineTo(20.421f, 17.085f)
                close()
                moveTo(13f, 17.75f)
                curveTo(14.433f, 17.75f, 15.644f, 18.402f, 16.615f, 19.262f)
                curveTo(15.666f, 19.963f, 14.462f, 20.5f, 13f, 20.5f)
                curveTo(11.027f, 20.5f, 10.51f, 19.578f, 10.51f, 19.125f)
                curveTo(10.51f, 18.672f, 11.027f, 17.75f, 13f, 17.75f)
                close()
            }
        }.build()

        return _Lasso!!
    }

@Suppress("ObjectPropertyName")
private var _Lasso: ImageVector? = null

@Preview
@Composable
private fun LassoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Lasso, contentDescription = null)
    }
}
