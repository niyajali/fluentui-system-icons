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

public val FluentIcons.Filled.PersonNote: ImageVector
    get() {
        if (_PersonNote != null) {
            return _PersonNote!!
        }
        _PersonNote = ImageVector.Builder(
            name = "Filled.PersonNote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 15f)
                curveTo(11f, 14.65f, 11.061f, 14.313f, 11.171f, 14f)
                horizontalLineTo(4.253f)
                curveTo(3.011f, 14f, 2.004f, 15.007f, 2.004f, 16.249f)
                verticalLineTo(17.169f)
                curveTo(2.004f, 17.741f, 2.182f, 18.299f, 2.514f, 18.765f)
                curveTo(4.056f, 20.929f, 6.579f, 22.001f, 10f, 22.001f)
                curveTo(10.398f, 22.001f, 10.783f, 21.987f, 11.157f, 21.958f)
                curveTo(11.055f, 21.657f, 11f, 21.335f, 11f, 21f)
                verticalLineTo(15f)
                close()
                moveTo(10f, 2.005f)
                curveTo(12.762f, 2.005f, 15f, 4.243f, 15f, 7.005f)
                curveTo(15f, 9.766f, 12.762f, 12.005f, 10f, 12.005f)
                curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
                curveTo(5f, 4.243f, 7.239f, 2.005f, 10f, 2.005f)
                close()
                moveTo(12f, 15f)
                curveTo(12f, 13.896f, 12.896f, 13f, 14f, 13f)
                horizontalLineTo(21f)
                curveTo(22.105f, 13f, 23f, 13.896f, 23f, 15f)
                verticalLineTo(21f)
                curveTo(23f, 22.105f, 22.105f, 23f, 21f, 23f)
                horizontalLineTo(14f)
                curveTo(12.896f, 23f, 12f, 22.105f, 12f, 21f)
                verticalLineTo(15f)
                close()
                moveTo(14.5f, 16f)
                curveTo(14.224f, 16f, 14f, 16.224f, 14f, 16.5f)
                curveTo(14f, 16.776f, 14.224f, 17f, 14.5f, 17f)
                horizontalLineTo(20.5f)
                curveTo(20.777f, 17f, 21f, 16.776f, 21f, 16.5f)
                curveTo(21f, 16.224f, 20.777f, 16f, 20.5f, 16f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 19f)
                curveTo(14.224f, 19f, 14f, 19.224f, 14f, 19.5f)
                curveTo(14f, 19.776f, 14.224f, 20f, 14.5f, 20f)
                horizontalLineTo(20.5f)
                curveTo(20.777f, 20f, 21f, 19.776f, 21f, 19.5f)
                curveTo(21f, 19.224f, 20.777f, 19f, 20.5f, 19f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _PersonNote!!
    }

@Suppress("ObjectPropertyName")
private var _PersonNote: ImageVector? = null

@Preview
@Composable
private fun PersonNotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PersonNote, contentDescription = null)
    }
}
