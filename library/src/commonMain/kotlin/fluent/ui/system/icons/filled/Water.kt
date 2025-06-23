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

public val FluentIcons.Filled.Water: ImageVector
    get() {
        if (_Water != null) {
            return _Water!!
        }
        _Water = ImageVector.Builder(
            name = "Filled.Water",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.456f, 3.501f)
                curveTo(18.85f, 3.483f, 19.218f, 3.7f, 19.395f, 4.053f)
                curveTo(19.817f, 4.898f, 20.334f, 5.406f, 20.724f, 5.698f)
                curveTo(20.921f, 5.845f, 21.087f, 5.939f, 21.196f, 5.993f)
                curveTo(21.25f, 6.02f, 21.29f, 6.037f, 21.311f, 6.045f)
                lineTo(21.326f, 6.051f)
                curveTo(21.843f, 6.229f, 22.122f, 6.791f, 21.95f, 7.311f)
                curveTo(21.776f, 7.835f, 21.21f, 8.12f, 20.686f, 7.946f)
                lineTo(20.684f, 7.945f)
                lineTo(20.682f, 7.945f)
                lineTo(20.677f, 7.943f)
                lineTo(20.667f, 7.939f)
                lineTo(20.638f, 7.929f)
                curveTo(20.617f, 7.921f, 20.589f, 7.911f, 20.557f, 7.898f)
                curveTo(20.492f, 7.871f, 20.406f, 7.834f, 20.305f, 7.783f)
                curveTo(20.101f, 7.681f, 19.83f, 7.526f, 19.526f, 7.299f)
                curveTo(19.22f, 7.07f, 18.883f, 6.769f, 18.55f, 6.38f)
                curveTo(17.686f, 7.425f, 16.5f, 7.997f, 15.25f, 7.997f)
                curveTo(14.024f, 7.997f, 12.859f, 7.446f, 12f, 6.439f)
                curveTo(11.141f, 7.446f, 9.977f, 7.997f, 8.75f, 7.997f)
                curveTo(7.5f, 7.997f, 6.315f, 7.425f, 5.451f, 6.381f)
                curveTo(5.118f, 6.77f, 4.781f, 7.071f, 4.475f, 7.3f)
                curveTo(4.172f, 7.527f, 3.901f, 7.683f, 3.697f, 7.785f)
                curveTo(3.596f, 7.836f, 3.51f, 7.874f, 3.445f, 7.9f)
                curveTo(3.413f, 7.913f, 3.386f, 7.924f, 3.364f, 7.932f)
                lineTo(3.336f, 7.942f)
                lineTo(3.325f, 7.946f)
                lineTo(3.32f, 7.947f)
                lineTo(3.318f, 7.948f)
                lineTo(3.317f, 7.948f)
                curveTo(2.793f, 8.123f, 2.226f, 7.84f, 2.052f, 7.316f)
                curveTo(1.878f, 6.796f, 2.156f, 6.235f, 2.672f, 6.055f)
                lineTo(2.688f, 6.049f)
                curveTo(2.709f, 6.04f, 2.749f, 6.023f, 2.803f, 5.996f)
                curveTo(2.912f, 5.942f, 3.079f, 5.848f, 3.275f, 5.7f)
                curveTo(3.666f, 5.407f, 4.183f, 4.898f, 4.606f, 4.053f)
                curveTo(4.782f, 3.7f, 5.15f, 3.484f, 5.545f, 3.502f)
                curveTo(5.939f, 3.519f, 6.286f, 3.767f, 6.431f, 4.134f)
                curveTo(6.956f, 5.468f, 7.917f, 5.997f, 8.75f, 5.997f)
                curveTo(9.583f, 5.997f, 10.545f, 5.468f, 11.07f, 4.134f)
                curveTo(11.22f, 3.752f, 11.589f, 3.501f, 12f, 3.501f)
                curveTo(12.411f, 3.501f, 12.78f, 3.752f, 12.931f, 4.134f)
                curveTo(13.456f, 5.468f, 14.417f, 5.997f, 15.25f, 5.997f)
                curveTo(16.083f, 5.997f, 17.045f, 5.468f, 17.57f, 4.134f)
                curveTo(17.714f, 3.766f, 18.062f, 3.518f, 18.456f, 3.501f)
                close()
                moveTo(18.456f, 9.501f)
                curveTo(18.85f, 9.483f, 19.218f, 9.7f, 19.395f, 10.053f)
                curveTo(19.817f, 10.898f, 20.334f, 11.406f, 20.724f, 11.698f)
                curveTo(20.921f, 11.845f, 21.087f, 11.939f, 21.196f, 11.993f)
                curveTo(21.25f, 12.02f, 21.29f, 12.037f, 21.311f, 12.045f)
                lineTo(21.326f, 12.051f)
                curveTo(21.843f, 12.229f, 22.122f, 12.791f, 21.95f, 13.311f)
                curveTo(21.776f, 13.835f, 21.21f, 14.12f, 20.686f, 13.946f)
                lineTo(20.684f, 13.945f)
                lineTo(20.682f, 13.945f)
                lineTo(20.677f, 13.943f)
                lineTo(20.667f, 13.939f)
                lineTo(20.638f, 13.929f)
                curveTo(20.617f, 13.921f, 20.589f, 13.911f, 20.557f, 13.898f)
                curveTo(20.492f, 13.871f, 20.406f, 13.834f, 20.305f, 13.783f)
                curveTo(20.101f, 13.681f, 19.83f, 13.526f, 19.526f, 13.299f)
                curveTo(19.22f, 13.07f, 18.883f, 12.769f, 18.55f, 12.38f)
                curveTo(17.686f, 13.425f, 16.5f, 13.997f, 15.25f, 13.997f)
                curveTo(14.024f, 13.997f, 12.859f, 13.446f, 12f, 12.439f)
                curveTo(11.141f, 13.446f, 9.977f, 13.997f, 8.75f, 13.997f)
                curveTo(7.5f, 13.997f, 6.315f, 13.425f, 5.451f, 12.381f)
                curveTo(5.118f, 12.77f, 4.781f, 13.071f, 4.475f, 13.3f)
                curveTo(4.172f, 13.528f, 3.901f, 13.683f, 3.697f, 13.785f)
                curveTo(3.596f, 13.836f, 3.51f, 13.874f, 3.445f, 13.9f)
                curveTo(3.413f, 13.913f, 3.386f, 13.924f, 3.364f, 13.932f)
                lineTo(3.336f, 13.942f)
                lineTo(3.325f, 13.946f)
                lineTo(3.32f, 13.947f)
                lineTo(3.318f, 13.948f)
                lineTo(3.317f, 13.948f)
                curveTo(2.793f, 14.123f, 2.226f, 13.84f, 2.052f, 13.316f)
                curveTo(1.878f, 12.796f, 2.156f, 12.235f, 2.672f, 12.055f)
                lineTo(2.688f, 12.049f)
                curveTo(2.709f, 12.04f, 2.749f, 12.023f, 2.803f, 11.996f)
                curveTo(2.912f, 11.942f, 3.079f, 11.848f, 3.275f, 11.7f)
                curveTo(3.666f, 11.407f, 4.183f, 10.898f, 4.606f, 10.053f)
                curveTo(4.782f, 9.7f, 5.15f, 9.484f, 5.545f, 9.502f)
                curveTo(5.939f, 9.519f, 6.286f, 9.767f, 6.431f, 10.134f)
                curveTo(6.956f, 11.468f, 7.917f, 11.997f, 8.75f, 11.997f)
                curveTo(9.583f, 11.997f, 10.545f, 11.468f, 11.07f, 10.134f)
                curveTo(11.22f, 9.752f, 11.589f, 9.501f, 12f, 9.501f)
                curveTo(12.411f, 9.501f, 12.78f, 9.752f, 12.931f, 10.134f)
                curveTo(13.456f, 11.468f, 14.417f, 11.997f, 15.25f, 11.997f)
                curveTo(16.083f, 11.997f, 17.045f, 11.468f, 17.57f, 10.134f)
                curveTo(17.714f, 9.766f, 18.062f, 9.518f, 18.456f, 9.501f)
                close()
                moveTo(19.395f, 16.053f)
                curveTo(19.218f, 15.7f, 18.85f, 15.483f, 18.456f, 15.501f)
                curveTo(18.062f, 15.519f, 17.714f, 15.766f, 17.57f, 16.134f)
                curveTo(17.045f, 17.468f, 16.083f, 17.997f, 15.25f, 17.997f)
                curveTo(14.417f, 17.997f, 13.456f, 17.468f, 12.931f, 16.134f)
                curveTo(12.78f, 15.752f, 12.411f, 15.5f, 12f, 15.5f)
                curveTo(11.589f, 15.5f, 11.22f, 15.752f, 11.07f, 16.134f)
                curveTo(10.545f, 17.468f, 9.583f, 17.997f, 8.75f, 17.997f)
                curveTo(7.917f, 17.997f, 6.956f, 17.468f, 6.431f, 16.134f)
                curveTo(6.286f, 15.767f, 5.939f, 15.519f, 5.545f, 15.502f)
                curveTo(5.15f, 15.484f, 4.782f, 15.7f, 4.606f, 16.053f)
                curveTo(4.183f, 16.898f, 3.666f, 17.407f, 3.275f, 17.7f)
                curveTo(3.079f, 17.848f, 2.912f, 17.942f, 2.803f, 17.996f)
                curveTo(2.749f, 18.023f, 2.709f, 18.04f, 2.688f, 18.049f)
                lineTo(2.672f, 18.055f)
                curveTo(2.156f, 18.235f, 1.878f, 18.796f, 2.052f, 19.316f)
                curveTo(2.226f, 19.84f, 2.793f, 20.123f, 3.317f, 19.948f)
                lineTo(3.318f, 19.948f)
                lineTo(3.32f, 19.947f)
                lineTo(3.325f, 19.946f)
                lineTo(3.336f, 19.942f)
                lineTo(3.364f, 19.932f)
                curveTo(3.386f, 19.924f, 3.413f, 19.913f, 3.445f, 19.9f)
                curveTo(3.51f, 19.874f, 3.596f, 19.836f, 3.697f, 19.785f)
                curveTo(3.901f, 19.683f, 4.172f, 19.528f, 4.475f, 19.3f)
                curveTo(4.781f, 19.071f, 5.118f, 18.77f, 5.451f, 18.381f)
                curveTo(6.315f, 19.425f, 7.5f, 19.997f, 8.75f, 19.997f)
                curveTo(9.977f, 19.997f, 11.141f, 19.446f, 12f, 18.439f)
                curveTo(12.859f, 19.446f, 14.024f, 19.997f, 15.25f, 19.997f)
                curveTo(16.5f, 19.997f, 17.686f, 19.425f, 18.55f, 18.38f)
                curveTo(18.883f, 18.769f, 19.22f, 19.07f, 19.526f, 19.299f)
                curveTo(19.83f, 19.526f, 20.101f, 19.681f, 20.305f, 19.783f)
                curveTo(20.406f, 19.834f, 20.492f, 19.871f, 20.557f, 19.898f)
                curveTo(20.589f, 19.911f, 20.617f, 19.921f, 20.638f, 19.929f)
                lineTo(20.667f, 19.939f)
                lineTo(20.677f, 19.943f)
                lineTo(20.682f, 19.945f)
                lineTo(20.686f, 19.946f)
                curveTo(21.21f, 20.12f, 21.776f, 19.835f, 21.95f, 19.311f)
                curveTo(22.122f, 18.791f, 21.843f, 18.229f, 21.326f, 18.051f)
                lineTo(21.311f, 18.045f)
                curveTo(21.29f, 18.037f, 21.25f, 18.02f, 21.196f, 17.993f)
                curveTo(21.087f, 17.939f, 20.921f, 17.845f, 20.724f, 17.698f)
                curveTo(20.334f, 17.406f, 19.817f, 16.898f, 19.395f, 16.053f)
                close()
            }
        }.build()

        return _Water!!
    }

@Suppress("ObjectPropertyName")
private var _Water: ImageVector? = null

@Preview
@Composable
private fun WaterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Water, contentDescription = null)
    }
}
