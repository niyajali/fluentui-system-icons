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

public val FluentIcons.Regular.Step: ImageVector
    get() {
        if (_Step != null) {
            return _Step!!
        }
        _Step = ImageVector.Builder(
            name = "Regular.Step",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.5f, 3.25f)
                curveTo(14.5f, 2.56f, 15.06f, 2f, 15.75f, 2f)
                horizontalLineTo(20.75f)
                curveTo(21.44f, 2f, 22f, 2.56f, 22f, 3.25f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(3.25f)
                curveTo(2.56f, 22f, 2f, 21.44f, 2f, 20.75f)
                verticalLineTo(15.75f)
                curveTo(2f, 15.06f, 2.56f, 14.5f, 3.25f, 14.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.25f)
                curveTo(8f, 8.56f, 8.56f, 8f, 9.25f, 8f)
                horizontalLineTo(14.5f)
                verticalLineTo(3.25f)
                close()
                moveTo(16f, 3.5f)
                verticalLineTo(8.25f)
                curveTo(16f, 8.94f, 15.44f, 9.5f, 14.75f, 9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.75f)
                curveTo(9.5f, 15.44f, 8.94f, 16f, 8.25f, 16f)
                horizontalLineTo(3.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
                verticalLineTo(3.5f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Step!!
    }

@Suppress("ObjectPropertyName")
private var _Step: ImageVector? = null

@Preview
@Composable
private fun StepPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Step, contentDescription = null)
    }
}
