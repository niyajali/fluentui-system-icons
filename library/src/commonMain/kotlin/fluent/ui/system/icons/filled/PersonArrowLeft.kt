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

public val FluentIcons.Filled.PersonArrowLeft: ImageVector
    get() {
        if (_PersonArrowLeft != null) {
            return _PersonArrowLeft!!
        }
        _PersonArrowLeft = ImageVector.Builder(
            name = "Filled.PersonArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.463f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.463f, 14.463f, 12f, 17.5f, 12f)
                close()
                moveTo(12.023f, 14f)
                curveTo(11.375f, 15.01f, 11f, 16.211f, 11f, 17.5f)
                curveTo(11f, 19.144f, 11.611f, 20.646f, 12.618f, 21.791f)
                curveTo(11.815f, 21.931f, 10.942f, 22.001f, 10f, 22.001f)
                curveTo(7.111f, 22.001f, 4.872f, 21.345f, 3.309f, 20.001f)
                curveTo(2.481f, 19.289f, 2.004f, 18.25f, 2.004f, 17.157f)
                verticalLineTo(16.25f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.254f, 14f)
                lineTo(12.023f, 14f)
                close()
                moveTo(16.72f, 14.589f)
                lineTo(16.65f, 14.647f)
                lineTo(14.135f, 17.163f)
                lineTo(14.094f, 17.214f)
                lineTo(14.059f, 17.271f)
                lineTo(14.027f, 17.349f)
                lineTo(14.016f, 17.392f)
                lineTo(14.004f, 17.479f)
                lineTo(14.008f, 17.566f)
                lineTo(14.027f, 17.651f)
                lineTo(14.059f, 17.729f)
                lineTo(14.084f, 17.771f)
                lineTo(14.135f, 17.837f)
                lineTo(16.65f, 20.354f)
                curveTo(16.846f, 20.549f, 17.162f, 20.549f, 17.357f, 20.354f)
                curveTo(17.531f, 20.18f, 17.55f, 19.911f, 17.415f, 19.716f)
                lineTo(17.357f, 19.647f)
                lineTo(15.711f, 18f)
                horizontalLineTo(20.5f)
                curveTo(20.746f, 18f, 20.95f, 17.823f, 20.992f, 17.59f)
                lineTo(21f, 17.5f)
                curveTo(21f, 17.255f, 20.823f, 17.051f, 20.59f, 17.008f)
                lineTo(20.5f, 17f)
                horizontalLineTo(15.711f)
                lineTo(17.357f, 15.354f)
                curveTo(17.531f, 15.18f, 17.55f, 14.911f, 17.415f, 14.716f)
                lineTo(17.357f, 14.647f)
                curveTo(17.184f, 14.473f, 16.914f, 14.454f, 16.72f, 14.589f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
        }.build()

        return _PersonArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _PersonArrowLeft: ImageVector? = null

@Preview
@Composable
private fun PersonArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonArrowLeft, contentDescription = null)
    }
}
