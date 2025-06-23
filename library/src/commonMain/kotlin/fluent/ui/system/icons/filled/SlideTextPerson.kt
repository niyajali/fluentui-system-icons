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

public val FluentIcons.Filled.SlideTextPerson: ImageVector
    get() {
        if (_SlideTextPerson != null) {
            return _SlideTextPerson!!
        }
        _SlideTextPerson = ImageVector.Builder(
            name = "Filled.SlideTextPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 4f)
                curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(13.002f)
                curveTo(13.001f, 19.958f, 13f, 19.917f, 13f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(13f, 18.24f, 14.242f, 17f, 15.773f, 17f)
                horizontalLineTo(16.051f)
                curveTo(15.402f, 16.365f, 15f, 15.479f, 15f, 14.5f)
                curveTo(15f, 13.756f, 15.232f, 13.067f, 15.627f, 12.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
                curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
                horizontalLineTo(15.75f)
                curveTo(16.125f, 11f, 16.435f, 11.275f, 16.491f, 11.634f)
                curveTo(17.06f, 11.234f, 17.752f, 11f, 18.5f, 11f)
                curveTo(20.263f, 11f, 21.722f, 12.304f, 21.965f, 14f)
                horizontalLineTo(22f)
                verticalLineTo(6.75f)
                curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
                horizontalLineTo(4.75f)
                close()
                moveTo(6f, 8.75f)
                curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 8f, 12f, 8.336f, 12f, 8.75f)
                curveTo(12f, 9.164f, 11.664f, 9.5f, 11.25f, 9.5f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 9.5f, 6f, 9.164f, 6f, 8.75f)
                close()
                moveTo(6.75f, 15.5f)
                curveTo(6.336f, 15.5f, 6f, 15.164f, 6f, 14.75f)
                curveTo(6f, 14.336f, 6.336f, 14f, 6.75f, 14f)
                horizontalLineTo(13.25f)
                curveTo(13.664f, 14f, 14f, 14.336f, 14f, 14.75f)
                curveTo(14f, 15.164f, 13.664f, 15.5f, 13.25f, 15.5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.431f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.437f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _SlideTextPerson!!
    }

@Suppress("ObjectPropertyName")
private var _SlideTextPerson: ImageVector? = null

@Preview
@Composable
private fun SlideTextPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideTextPerson, contentDescription = null)
    }
}
