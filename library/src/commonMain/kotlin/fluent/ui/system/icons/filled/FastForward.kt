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

public val FluentIcons.Filled.FastForward: ImageVector
    get() {
        if (_FastForward != null) {
            return _FastForward!!
        }
        _FastForward = ImageVector.Builder(
            name = "Filled.FastForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.97f, 4.363f)
                curveTo(12.996f, 3.534f, 11.498f, 4.226f, 11.498f, 5.505f)
                verticalLineTo(9.493f)
                lineTo(5.47f, 4.363f)
                curveTo(4.496f, 3.534f, 2.998f, 4.227f, 2.998f, 5.506f)
                verticalLineTo(18.499f)
                curveTo(2.998f, 19.377f, 3.705f, 19.979f, 4.463f, 20.001f)
                horizontalLineTo(4.55f)
                curveTo(4.868f, 19.992f, 5.191f, 19.879f, 5.47f, 19.641f)
                lineTo(11.498f, 14.511f)
                verticalLineTo(18.498f)
                curveTo(11.498f, 19.777f, 12.996f, 20.469f, 13.97f, 19.64f)
                lineTo(21.38f, 13.334f)
                curveTo(22.201f, 12.635f, 22.201f, 11.368f, 21.38f, 10.669f)
                lineTo(13.97f, 4.363f)
                close()
            }
        }.build()

        return _FastForward!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward: ImageVector? = null

@Preview
@Composable
private fun FastForwardPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FastForward, contentDescription = null)
    }
}
