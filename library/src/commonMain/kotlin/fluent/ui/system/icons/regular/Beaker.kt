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

public val FluentIcons.Regular.Beaker: ImageVector
    get() {
        if (_Beaker != null) {
            return _Beaker!!
        }
        _Beaker = ImageVector.Builder(
            name = "Regular.Beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 4.5f)
                horizontalLineTo(9f)
                verticalLineTo(10.738f)
                curveTo(9f, 11.113f, 8.906f, 11.482f, 8.727f, 11.812f)
                lineTo(5.143f, 18.415f)
                curveTo(4.51f, 19.581f, 5.354f, 21f, 6.681f, 21f)
                horizontalLineTo(17.319f)
                curveTo(18.646f, 21f, 19.49f, 19.581f, 18.857f, 18.415f)
                lineTo(15.273f, 11.812f)
                curveTo(15.094f, 11.482f, 15f, 11.113f, 15f, 10.738f)
                verticalLineTo(4.5f)
                horizontalLineTo(16f)
                curveTo(16.414f, 4.5f, 16.75f, 4.164f, 16.75f, 3.75f)
                curveTo(16.75f, 3.336f, 16.414f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                curveTo(7.586f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
                curveTo(7.25f, 4.164f, 7.586f, 4.5f, 8f, 4.5f)
                close()
                moveTo(10.5f, 10.738f)
                verticalLineTo(4.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.738f)
                curveTo(13.5f, 11.363f, 13.656f, 11.978f, 13.954f, 12.527f)
                lineTo(14.754f, 14f)
                horizontalLineTo(9.246f)
                lineTo(10.046f, 12.527f)
                curveTo(10.344f, 11.978f, 10.5f, 11.363f, 10.5f, 10.738f)
                close()
                moveTo(8.432f, 15.5f)
                horizontalLineTo(15.568f)
                lineTo(17.539f, 19.131f)
                curveTo(17.629f, 19.297f, 17.509f, 19.5f, 17.319f, 19.5f)
                horizontalLineTo(6.681f)
                curveTo(6.491f, 19.5f, 6.371f, 19.297f, 6.461f, 19.131f)
                lineTo(8.432f, 15.5f)
                close()
            }
        }.build()

        return _Beaker!!
    }

@Suppress("ObjectPropertyName")
private var _Beaker: ImageVector? = null

@Preview
@Composable
private fun BeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Beaker, contentDescription = null)
    }
}
