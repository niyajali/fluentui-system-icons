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

public val FluentIcons.Filled.ArrowMaximize: ImageVector
    get() {
        if (_ArrowMaximize != null) {
            return _ArrowMaximize!!
        }
        _ArrowMaximize = ImageVector.Builder(
            name = "Filled.ArrowMaximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.5f, 3.5f)
                curveTo(20.052f, 3.5f, 20.5f, 3.948f, 20.5f, 4.5f)
                verticalLineTo(12f)
                curveTo(20.5f, 12.552f, 20.052f, 13f, 19.5f, 13f)
                curveTo(18.948f, 13f, 18.5f, 12.552f, 18.5f, 12f)
                verticalLineTo(6.914f)
                lineTo(6.914f, 18.5f)
                horizontalLineTo(12f)
                curveTo(12.552f, 18.5f, 13f, 18.948f, 13f, 19.5f)
                curveTo(13f, 20.052f, 12.552f, 20.5f, 12f, 20.5f)
                horizontalLineTo(4.5f)
                curveTo(3.948f, 20.5f, 3.5f, 20.052f, 3.5f, 19.5f)
                verticalLineTo(12f)
                curveTo(3.5f, 11.448f, 3.948f, 11f, 4.5f, 11f)
                curveTo(5.052f, 11f, 5.5f, 11.448f, 5.5f, 12f)
                verticalLineTo(17.086f)
                lineTo(17.086f, 5.5f)
                horizontalLineTo(12f)
                curveTo(11.448f, 5.5f, 11f, 5.052f, 11f, 4.5f)
                curveTo(11f, 3.948f, 11.448f, 3.5f, 12f, 3.5f)
                horizontalLineTo(19.5f)
                close()
            }
        }.build()

        return _ArrowMaximize!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowMaximize: ImageVector? = null

@Preview
@Composable
private fun ArrowMaximizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowMaximize, contentDescription = null)
    }
}
