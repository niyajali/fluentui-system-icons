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

public val FluentIcons.Filled.TreeDeciduous: ImageVector
    get() {
        if (_TreeDeciduous != null) {
            return _TreeDeciduous!!
        }
        _TreeDeciduous = ImageVector.Builder(
            name = "Filled.TreeDeciduous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.998f, 4.816f)
                curveTo(8.586f, 3.175f, 10.155f, 2f, 12f, 2f)
                curveTo(13.845f, 2f, 15.414f, 3.175f, 16.002f, 4.816f)
                curveTo(17.991f, 5.172f, 19.5f, 6.909f, 19.5f, 9f)
                curveTo(19.5f, 9.367f, 19.453f, 9.723f, 19.366f, 10.063f)
                curveTo(20.64f, 10.797f, 21.5f, 12.172f, 21.5f, 13.75f)
                curveTo(21.5f, 15.953f, 19.825f, 17.763f, 17.679f, 17.979f)
                curveTo(17.621f, 17.993f, 17.562f, 18f, 17.5f, 18f)
                horizontalLineTo(14.5f)
                verticalLineTo(20.25f)
                curveTo(14.5f, 21.216f, 13.717f, 22f, 12.75f, 22f)
                horizontalLineTo(11.25f)
                curveTo(10.283f, 22f, 9.5f, 21.216f, 9.5f, 20.25f)
                verticalLineTo(18f)
                horizontalLineTo(6.5f)
                curveTo(6.438f, 18f, 6.379f, 17.993f, 6.321f, 17.979f)
                curveTo(4.175f, 17.763f, 2.5f, 15.953f, 2.5f, 13.75f)
                curveTo(2.5f, 12.172f, 3.359f, 10.797f, 4.634f, 10.063f)
                curveTo(4.547f, 9.723f, 4.5f, 9.367f, 4.5f, 9f)
                curveTo(4.5f, 6.909f, 6.009f, 5.172f, 7.998f, 4.816f)
                close()
                moveTo(11f, 18f)
                verticalLineTo(20.25f)
                curveTo(11f, 20.388f, 11.112f, 20.5f, 11.25f, 20.5f)
                horizontalLineTo(12.75f)
                curveTo(12.888f, 20.5f, 13f, 20.388f, 13f, 20.25f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _TreeDeciduous!!
    }

@Suppress("ObjectPropertyName")
private var _TreeDeciduous: ImageVector? = null

@Preview
@Composable
private fun TreeDeciduousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TreeDeciduous, contentDescription = null)
    }
}
