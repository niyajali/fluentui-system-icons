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

public val FluentIcons.Filled.PersonProhibited: ImageVector
    get() {
        if (_PersonProhibited != null) {
            return _PersonProhibited!!
        }
        _PersonProhibited = ImageVector.Builder(
            name = "Filled.PersonProhibited",
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
                moveTo(12.023f, 13.999f)
                curveTo(11.376f, 15.01f, 11f, 16.211f, 11f, 17.5f)
                curveTo(11f, 19.144f, 11.611f, 20.645f, 12.617f, 21.79f)
                curveTo(11.815f, 21.932f, 10.942f, 22.001f, 10f, 22.001f)
                curveTo(7.111f, 22.001f, 4.872f, 21.345f, 3.309f, 20.001f)
                curveTo(2.481f, 19.289f, 2.004f, 18.25f, 2.004f, 17.157f)
                verticalLineTo(16.25f)
                curveTo(2.004f, 15.007f, 3.011f, 14f, 4.254f, 14f)
                lineTo(12.023f, 13.999f)
                close()
                moveTo(20.81f, 15.252f)
                lineTo(15.253f, 20.809f)
                curveTo(15.893f, 21.245f, 16.667f, 21.5f, 17.5f, 21.5f)
                curveTo(19.709f, 21.5f, 21.5f, 19.709f, 21.5f, 17.5f)
                curveTo(21.5f, 16.667f, 21.246f, 15.893f, 20.81f, 15.252f)
                close()
                moveTo(17.5f, 13.5f)
                curveTo(15.291f, 13.5f, 13.5f, 15.291f, 13.5f, 17.5f)
                curveTo(13.5f, 18.334f, 13.755f, 19.107f, 14.191f, 19.748f)
                lineTo(19.748f, 14.191f)
                curveTo(19.108f, 13.755f, 18.334f, 13.5f, 17.5f, 13.5f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
            }
        }.build()

        return _PersonProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _PersonProhibited: ImageVector? = null

@Preview
@Composable
private fun PersonProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonProhibited, contentDescription = null)
    }
}
