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

public val FluentIcons.Filled.TextSubscript: ImageVector
    get() {
        if (_TextSubscript != null) {
            return _TextSubscript!!
        }
        _TextSubscript = ImageVector.Builder(
            name = "Filled.TextSubscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16.759f, 5.651f)
                curveTo(17.119f, 5.231f, 17.07f, 4.6f, 16.651f, 4.241f)
                curveTo(16.232f, 3.881f, 15.6f, 3.93f, 15.241f, 4.349f)
                lineTo(10f, 10.463f)
                lineTo(4.759f, 4.349f)
                curveTo(4.4f, 3.93f, 3.769f, 3.881f, 3.349f, 4.241f)
                curveTo(2.93f, 4.6f, 2.881f, 5.231f, 3.241f, 5.651f)
                lineTo(8.683f, 12f)
                lineTo(3.241f, 18.349f)
                curveTo(2.881f, 18.769f, 2.93f, 19.4f, 3.349f, 19.759f)
                curveTo(3.769f, 20.119f, 4.4f, 20.07f, 4.759f, 19.651f)
                lineTo(10f, 13.537f)
                lineTo(15.069f, 19.451f)
                curveTo(15.218f, 18.622f, 15.589f, 17.979f, 16.012f, 17.478f)
                lineTo(11.317f, 12f)
                lineTo(16.759f, 5.651f)
                close()
                moveTo(18.736f, 14.75f)
                curveTo(18.349f, 14.75f, 18f, 15.115f, 18f, 15.523f)
                curveTo(18f, 16.075f, 17.552f, 16.523f, 17f, 16.523f)
                curveTo(16.448f, 16.523f, 16f, 16.075f, 16f, 15.523f)
                curveTo(16f, 14.158f, 17.102f, 12.75f, 18.736f, 12.75f)
                curveTo(19.666f, 12.75f, 20.579f, 13.185f, 21.096f, 13.98f)
                curveTo(21.644f, 14.822f, 21.642f, 15.898f, 21.045f, 16.916f)
                curveTo(20.737f, 17.438f, 20.322f, 17.824f, 19.939f, 18.126f)
                curveTo(19.746f, 18.278f, 19.55f, 18.419f, 19.371f, 18.545f)
                lineTo(19.293f, 18.6f)
                curveTo(19.14f, 18.708f, 19.001f, 18.806f, 18.867f, 18.907f)
                curveTo(18.706f, 19.028f, 18.57f, 19.14f, 18.456f, 19.25f)
                horizontalLineTo(20.451f)
                curveTo(21.003f, 19.25f, 21.451f, 19.698f, 21.451f, 20.25f)
                curveTo(21.451f, 20.802f, 21.003f, 21.25f, 20.451f, 21.25f)
                horizontalLineTo(17.016f)
                lineTo(17.008f, 21.25f)
                lineTo(17f, 21.25f)
                curveTo(16.448f, 21.25f, 16f, 20.802f, 16f, 20.25f)
                curveTo(16f, 18.733f, 16.902f, 17.883f, 17.664f, 17.309f)
                curveTo(17.825f, 17.188f, 17.992f, 17.07f, 18.144f, 16.963f)
                lineTo(18.217f, 16.912f)
                curveTo(18.394f, 16.786f, 18.552f, 16.673f, 18.699f, 16.557f)
                curveTo(18.994f, 16.324f, 19.193f, 16.119f, 19.32f, 15.903f)
                curveTo(19.59f, 15.443f, 19.497f, 15.189f, 19.42f, 15.071f)
                curveTo(19.312f, 14.906f, 19.068f, 14.75f, 18.736f, 14.75f)
                close()
            }
        }.build()

        return _TextSubscript!!
    }

@Suppress("ObjectPropertyName")
private var _TextSubscript: ImageVector? = null

@Preview
@Composable
private fun TextSubscriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextSubscript, contentDescription = null)
    }
}
