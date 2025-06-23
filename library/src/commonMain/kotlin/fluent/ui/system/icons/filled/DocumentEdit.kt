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

public val FluentIcons.Filled.DocumentEdit: ImageVector
    get() {
        if (_DocumentEdit != null) {
            return _DocumentEdit!!
        }
        _DocumentEdit = ImageVector.Builder(
            name = "Filled.DocumentEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(18.921f)
                curveTo(18.324f, 10.22f, 17.776f, 10.554f, 17.362f, 10.97f)
                lineTo(11.311f, 17.062f)
                curveTo(10.96f, 17.416f, 10.709f, 17.858f, 10.584f, 18.341f)
                lineTo(10.059f, 20.37f)
                curveTo(9.905f, 20.965f, 10.017f, 21.54f, 10.301f, 22f)
                horizontalLineTo(5.5f)
                curveTo(4.672f, 22f, 4f, 21.328f, 4f, 20.5f)
                verticalLineTo(3.5f)
                curveTo(4f, 2.672f, 4.672f, 2f, 5.5f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(12.196f, 17.572f)
                lineTo(18.098f, 11.67f)
                curveTo(18.991f, 10.777f, 20.438f, 10.777f, 21.33f, 11.67f)
                curveTo(22.223f, 12.562f, 22.223f, 14.009f, 21.33f, 14.902f)
                lineTo(15.428f, 20.804f)
                curveTo(15.084f, 21.149f, 14.653f, 21.393f, 14.181f, 21.511f)
                lineTo(12.35f, 21.968f)
                curveTo(11.554f, 22.167f, 10.833f, 21.446f, 11.032f, 20.65f)
                lineTo(11.489f, 18.819f)
                curveTo(11.607f, 18.347f, 11.851f, 17.916f, 12.196f, 17.572f)
                close()
            }
        }.build()

        return _DocumentEdit!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentEdit: ImageVector? = null

@Preview
@Composable
private fun DocumentEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentEdit, contentDescription = null)
    }
}
