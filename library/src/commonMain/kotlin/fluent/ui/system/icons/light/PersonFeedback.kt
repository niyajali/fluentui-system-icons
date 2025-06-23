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

public val FluentIcons.Light.PersonFeedback: ImageVector
    get() {
        if (_PersonFeedback != null) {
            return _PersonFeedback!!
        }
        _PersonFeedback = ImageVector.Builder(
            name = "Light.PersonFeedback",
            defaultWidth = 32.dp,
            defaultHeight = 32.dp,
            viewportWidth = 32f,
            viewportHeight = 32f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19f, 2f)
                curveTo(17.343f, 2f, 16f, 3.343f, 16f, 5f)
                verticalLineTo(10f)
                curveTo(16f, 11.657f, 17.343f, 13f, 19f, 13f)
                verticalLineTo(14.493f)
                curveTo(19f, 15.854f, 20.668f, 16.512f, 21.597f, 15.517f)
                lineTo(23.945f, 13f)
                horizontalLineTo(27f)
                curveTo(28.657f, 13f, 30f, 11.657f, 30f, 10f)
                verticalLineTo(5f)
                curveTo(30f, 3.343f, 28.657f, 2f, 27f, 2f)
                horizontalLineTo(19f)
                close()
                moveTo(17f, 5f)
                curveTo(17f, 3.895f, 17.895f, 3f, 19f, 3f)
                horizontalLineTo(27f)
                curveTo(28.105f, 3f, 29f, 3.895f, 29f, 5f)
                verticalLineTo(10f)
                curveTo(29f, 11.105f, 28.105f, 12f, 27f, 12f)
                horizontalLineTo(23.728f)
                curveTo(23.589f, 12f, 23.457f, 12.057f, 23.362f, 12.159f)
                lineTo(20.865f, 14.834f)
                curveTo(20.556f, 15.166f, 20f, 14.947f, 20f, 14.493f)
                verticalLineTo(12.5f)
                curveTo(20f, 12.224f, 19.776f, 12f, 19.5f, 12f)
                horizontalLineTo(19f)
                curveTo(17.895f, 12f, 17f, 11.105f, 17f, 10f)
                verticalLineTo(5f)
                close()
                moveTo(10.5f, 9f)
                curveTo(8.291f, 9f, 6.5f, 10.791f, 6.5f, 13f)
                curveTo(6.5f, 15.209f, 8.291f, 17f, 10.5f, 17f)
                curveTo(12.709f, 17f, 14.5f, 15.209f, 14.5f, 13f)
                curveTo(14.5f, 10.791f, 12.709f, 9f, 10.5f, 9f)
                close()
                moveTo(5.5f, 13f)
                curveTo(5.5f, 10.239f, 7.739f, 8f, 10.5f, 8f)
                curveTo(13.261f, 8f, 15.5f, 10.239f, 15.5f, 13f)
                curveTo(15.5f, 15.761f, 13.261f, 18f, 10.5f, 18f)
                curveTo(7.739f, 18f, 5.5f, 15.761f, 5.5f, 13f)
                close()
                moveTo(2f, 23f)
                curveTo(2f, 21.343f, 3.343f, 20f, 5f, 20f)
                horizontalLineTo(16f)
                curveTo(17.657f, 20f, 19f, 21.343f, 19f, 23f)
                lineTo(19f, 23.5f)
                curveTo(19f, 24.1f, 18.719f, 25.716f, 17.512f, 27.192f)
                curveTo(16.283f, 28.694f, 14.135f, 30f, 10.5f, 30f)
                curveTo(6.865f, 30f, 4.717f, 28.694f, 3.488f, 27.192f)
                curveTo(2.281f, 25.716f, 2f, 24.1f, 2f, 23.5f)
                verticalLineTo(23f)
                close()
                moveTo(5f, 21f)
                curveTo(3.895f, 21f, 3f, 21.895f, 3f, 23f)
                verticalLineTo(23.5f)
                curveTo(3f, 23.9f, 3.219f, 25.284f, 4.262f, 26.558f)
                curveTo(5.283f, 27.806f, 7.135f, 29f, 10.5f, 29f)
                curveTo(13.865f, 29f, 15.717f, 27.806f, 16.738f, 26.558f)
                curveTo(17.781f, 25.284f, 18f, 23.9f, 18f, 23.5f)
                lineTo(18f, 23f)
                curveTo(18f, 21.896f, 17.105f, 21f, 16f, 21f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _PersonFeedback!!
    }

@Suppress("ObjectPropertyName")
private var _PersonFeedback: ImageVector? = null

@Preview
@Composable
private fun PersonFeedbackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PersonFeedback, contentDescription = null)
    }
}
