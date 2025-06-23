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

public val FluentIcons.Filled.StarProhibited: ImageVector
    get() {
        if (_StarProhibited != null) {
            return _StarProhibited!!
        }
        _StarProhibited = ImageVector.Builder(
            name = "Filled.StarProhibited",
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
                moveTo(13.498f, 17.5f)
                curveTo(13.498f, 18.333f, 13.753f, 19.107f, 14.189f, 19.748f)
                lineTo(19.746f, 14.191f)
                curveTo(19.106f, 13.755f, 18.332f, 13.5f, 17.498f, 13.5f)
                curveTo(15.289f, 13.5f, 13.498f, 15.29f, 13.498f, 17.5f)
                close()
                moveTo(17.498f, 21.5f)
                curveTo(19.707f, 21.5f, 21.498f, 19.709f, 21.498f, 17.5f)
                curveTo(21.498f, 16.666f, 21.243f, 15.892f, 20.807f, 15.251f)
                lineTo(15.25f, 20.808f)
                curveTo(15.891f, 21.245f, 16.664f, 21.5f, 17.498f, 21.5f)
                close()
            }
        }.build()

        return _StarProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _StarProhibited: ImageVector? = null

@Preview
@Composable
private fun StarProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StarProhibited, contentDescription = null)
    }
}
