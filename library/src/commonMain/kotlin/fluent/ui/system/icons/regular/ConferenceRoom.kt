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

public val FluentIcons.Regular.ConferenceRoom: ImageVector
    get() {
        if (_ConferenceRoom != null) {
            return _ConferenceRoom!!
        }
        _ConferenceRoom = ImageVector.Builder(
            name = "Regular.ConferenceRoom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.821f, 2.003f)
                lineTo(10.922f, 2.02f)
                lineTo(19.422f, 4.02f)
                curveTo(19.727f, 4.092f, 19.951f, 4.344f, 19.993f, 4.647f)
                lineTo(20f, 4.75f)
                verticalLineTo(19.25f)
                curveTo(20f, 19.563f, 19.806f, 19.839f, 19.52f, 19.949f)
                lineTo(19.422f, 19.98f)
                lineTo(10.922f, 21.98f)
                curveTo(10.485f, 22.083f, 10.064f, 21.782f, 10.007f, 21.351f)
                lineTo(10f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(10f, 2.335f, 10.331f, 2.014f, 10.722f, 2f)
                lineTo(10.821f, 2.003f)
                close()
                moveTo(11.5f, 3.697f)
                verticalLineTo(20.303f)
                lineTo(18.5f, 18.656f)
                verticalLineTo(5.344f)
                lineTo(11.5f, 3.697f)
                close()
                moveTo(9f, 4f)
                verticalLineTo(5.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(4.75f)
                curveTo(4.37f, 20f, 4.057f, 19.718f, 4.007f, 19.352f)
                lineTo(4f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(4f, 4.37f, 4.282f, 4.056f, 4.648f, 4.007f)
                lineTo(4.75f, 4f)
                horizontalLineTo(9f)
                close()
                moveTo(14f, 11f)
                curveTo(14.552f, 11f, 15f, 11.448f, 15f, 12f)
                curveTo(15f, 12.552f, 14.552f, 13f, 14f, 13f)
                curveTo(13.448f, 13f, 13f, 12.552f, 13f, 12f)
                curveTo(13f, 11.448f, 13.448f, 11f, 14f, 11f)
                close()
            }
        }.build()

        return _ConferenceRoom!!
    }

@Suppress("ObjectPropertyName")
private var _ConferenceRoom: ImageVector? = null

@Preview
@Composable
private fun ConferenceRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ConferenceRoom, contentDescription = null)
    }
}
