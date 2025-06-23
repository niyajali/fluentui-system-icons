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

public val FluentIcons.Filled.StarArrowRightEnd: ImageVector
    get() {
        if (_StarArrowRightEnd != null) {
            return _StarArrowRightEnd!!
        }
        _StarArrowRightEnd = ImageVector.Builder(
            name = "Filled.StarArrowRightEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.788f, 3.102f)
                curveTo(11.283f, 2.099f, 12.714f, 2.099f, 13.209f, 3.102f)
                lineTo(15.567f, 7.88f)
                lineTo(20.84f, 8.646f)
                curveTo(21.947f, 8.807f, 22.389f, 10.168f, 21.588f, 10.949f)
                lineTo(20.682f, 11.831f)
                curveTo(19.741f, 11.302f, 18.655f, 11f, 17.498f, 11f)
                curveTo(13.908f, 11f, 10.998f, 13.91f, 10.998f, 17.5f)
                curveTo(10.998f, 18.11f, 11.082f, 18.701f, 11.24f, 19.262f)
                lineTo(7.283f, 21.342f)
                curveTo(6.292f, 21.863f, 5.135f, 21.022f, 5.324f, 19.919f)
                lineTo(6.224f, 14.668f)
                lineTo(2.409f, 10.949f)
                curveTo(1.608f, 10.168f, 2.05f, 8.807f, 3.157f, 8.646f)
                lineTo(8.43f, 7.88f)
                lineTo(10.788f, 3.102f)
                close()
                moveTo(22.998f, 17.5f)
                curveTo(22.998f, 20.537f, 20.536f, 23f, 17.498f, 23f)
                curveTo(14.46f, 23f, 11.998f, 20.537f, 11.998f, 17.5f)
                curveTo(11.998f, 14.462f, 14.46f, 12f, 17.498f, 12f)
                curveTo(20.536f, 12f, 22.998f, 14.462f, 22.998f, 17.5f)
                close()
                moveTo(14.498f, 17f)
                curveTo(14.222f, 17f, 13.998f, 17.223f, 13.998f, 17.5f)
                curveTo(13.998f, 17.776f, 14.222f, 18f, 14.498f, 18f)
                lineTo(19.291f, 18f)
                lineTo(17.645f, 19.646f)
                curveTo(17.449f, 19.841f, 17.449f, 20.158f, 17.645f, 20.353f)
                curveTo(17.84f, 20.548f, 18.156f, 20.548f, 18.352f, 20.353f)
                lineTo(20.852f, 17.853f)
                curveTo(21.047f, 17.658f, 21.047f, 17.341f, 20.852f, 17.146f)
                lineTo(18.352f, 14.646f)
                curveTo(18.156f, 14.451f, 17.84f, 14.451f, 17.645f, 14.646f)
                curveTo(17.449f, 14.841f, 17.449f, 15.158f, 17.645f, 15.353f)
                lineTo(19.291f, 17f)
                lineTo(14.498f, 17f)
                close()
            }
        }.build()

        return _StarArrowRightEnd!!
    }

@Suppress("ObjectPropertyName")
private var _StarArrowRightEnd: ImageVector? = null

@Preview
@Composable
private fun StarArrowRightEndPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarArrowRightEnd, contentDescription = null)
    }
}
