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
package fluent.ui.system.icons.light

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

public val FluentIcons.Light.LayoutRowTwoFocusTopSettings: ImageVector
    get() {
        if (_LayoutRowTwoFocusTopSettings != null) {
            return _LayoutRowTwoFocusTopSettings!!
        }
        _LayoutRowTwoFocusTopSettings = ImageVector.Builder(
            name = "Light.LayoutRowTwoFocusTopSettings",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 3f)
                curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
                verticalLineTo(24.5f)
                curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
                horizontalLineTo(16.375f)
                curveTo(16.13f, 28.683f, 15.906f, 28.349f, 15.704f, 28f)
                horizontalLineTo(7.5f)
                curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
                verticalLineTo(16f)
                horizontalLineTo(18.523f)
                curveTo(19.949f, 15.052f, 21.66f, 14.5f, 23.5f, 14.5f)
                curveTo(25.571f, 14.5f, 27.479f, 15.2f, 29f, 16.375f)
                verticalLineTo(7.5f)
                curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
                horizontalLineTo(7.5f)
                close()
                moveTo(18.843f, 19.536f)
                curveTo(19.103f, 20.38f, 18.589f, 21.266f, 17.726f, 21.464f)
                lineTo(16.19f, 21.815f)
                curveTo(16.066f, 22.356f, 16f, 22.92f, 16f, 23.5f)
                curveTo(16f, 24.015f, 16.052f, 24.517f, 16.151f, 25.003f)
                lineTo(17.848f, 25.427f)
                curveTo(18.685f, 25.636f, 19.181f, 26.493f, 18.944f, 27.319f)
                lineTo(18.448f, 29.043f)
                curveTo(19.231f, 29.757f, 20.165f, 30.307f, 21.198f, 30.64f)
                lineTo(22.458f, 29.34f)
                curveTo(23.057f, 28.722f, 24.051f, 28.722f, 24.651f, 29.339f)
                lineTo(25.887f, 30.612f)
                curveTo(26.917f, 30.266f, 27.848f, 29.703f, 28.624f, 28.977f)
                lineTo(28.157f, 27.463f)
                curveTo(27.897f, 26.62f, 28.411f, 25.733f, 29.274f, 25.536f)
                lineTo(30.81f, 25.185f)
                curveTo(30.934f, 24.643f, 31f, 24.079f, 31f, 23.5f)
                curveTo(31f, 22.985f, 30.948f, 22.482f, 30.849f, 21.996f)
                lineTo(29.152f, 21.573f)
                curveTo(28.315f, 21.364f, 27.819f, 20.506f, 28.056f, 19.68f)
                lineTo(28.552f, 17.956f)
                curveTo(27.769f, 17.243f, 26.835f, 16.692f, 25.802f, 16.36f)
                lineTo(24.542f, 17.659f)
                curveTo(23.943f, 18.277f, 22.949f, 18.278f, 22.349f, 17.66f)
                lineTo(21.113f, 16.388f)
                curveTo(20.083f, 16.733f, 19.152f, 17.297f, 18.376f, 18.023f)
                lineTo(18.843f, 19.536f)
                close()
                moveTo(25.5f, 23.5f)
                curveTo(25.5f, 24.604f, 24.605f, 25.5f, 23.5f, 25.5f)
                curveTo(22.395f, 25.5f, 21.5f, 24.604f, 21.5f, 23.5f)
                curveTo(21.5f, 22.395f, 22.395f, 21.5f, 23.5f, 21.5f)
                curveTo(24.605f, 21.5f, 25.5f, 22.395f, 25.5f, 23.5f)
                close()
            }
        }.build()

        return _LayoutRowTwoFocusTopSettings!!
    }

@Suppress("ObjectPropertyName")
private var _LayoutRowTwoFocusTopSettings: ImageVector? = null

@Preview
@Composable
private fun LayoutRowTwoFocusTopSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.LayoutRowTwoFocusTopSettings, contentDescription = null)
    }
}
