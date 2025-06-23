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

public val FluentIcons.Filled.ProjectionScreen: ImageVector
    get() {
        if (_ProjectionScreen != null) {
            return _ProjectionScreen!!
        }
        _ProjectionScreen = ImageVector.Builder(
            name = "Filled.ProjectionScreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.5f, 3f)
                curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
                curveTo(2f, 5.153f, 2.417f, 5.709f, 3f, 5.915f)
                verticalLineTo(13.25f)
                curveTo(3f, 15.321f, 4.679f, 17f, 6.75f, 17f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 19.5f, 7f, 19.836f, 7f, 20.25f)
                curveTo(7f, 20.664f, 7.336f, 21f, 7.75f, 21f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 21f, 17f, 20.664f, 17f, 20.25f)
                curveTo(17f, 19.836f, 16.664f, 19.5f, 16.25f, 19.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(17f)
                horizontalLineTo(17.25f)
                curveTo(19.321f, 17f, 21f, 15.321f, 21f, 13.25f)
                verticalLineTo(5.915f)
                curveTo(21.583f, 5.709f, 22f, 5.153f, 22f, 4.5f)
                curveTo(22f, 3.672f, 21.328f, 3f, 20.5f, 3f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()

        return _ProjectionScreen!!
    }

@Suppress("ObjectPropertyName")
private var _ProjectionScreen: ImageVector? = null

@Preview
@Composable
private fun ProjectionScreenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ProjectionScreen, contentDescription = null)
    }
}
