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

public val FluentIcons.Filled.TextSuperscript: ImageVector
    get() {
        if (_TextSuperscript != null) {
            return _TextSuperscript!!
        }
        _TextSuperscript = ImageVector.Builder(
            name = "Filled.TextSuperscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.736f, 3.75f)
                curveTo(18.349f, 3.75f, 18f, 4.115f, 18f, 4.523f)
                curveTo(18f, 5.075f, 17.552f, 5.523f, 17f, 5.523f)
                curveTo(16.448f, 5.523f, 16f, 5.075f, 16f, 4.523f)
                curveTo(16f, 3.158f, 17.102f, 1.75f, 18.736f, 1.75f)
                curveTo(19.666f, 1.75f, 20.579f, 2.185f, 21.096f, 2.98f)
                curveTo(21.644f, 3.822f, 21.642f, 4.898f, 21.045f, 5.916f)
                curveTo(20.737f, 6.438f, 20.322f, 6.824f, 19.939f, 7.126f)
                curveTo(19.746f, 7.278f, 19.55f, 7.418f, 19.371f, 7.545f)
                lineTo(19.293f, 7.6f)
                curveTo(19.14f, 7.708f, 19.001f, 7.806f, 18.867f, 7.907f)
                curveTo(18.706f, 8.028f, 18.57f, 8.14f, 18.456f, 8.25f)
                horizontalLineTo(20.451f)
                curveTo(21.003f, 8.25f, 21.451f, 8.698f, 21.451f, 9.25f)
                curveTo(21.451f, 9.802f, 21.003f, 10.25f, 20.451f, 10.25f)
                horizontalLineTo(17.016f)
                lineTo(17.008f, 10.25f)
                lineTo(17f, 10.25f)
                curveTo(16.448f, 10.25f, 16f, 9.802f, 16f, 9.25f)
                curveTo(16f, 7.733f, 16.902f, 6.883f, 17.664f, 6.309f)
                curveTo(17.825f, 6.188f, 17.992f, 6.071f, 18.144f, 5.963f)
                lineTo(18.217f, 5.912f)
                curveTo(18.394f, 5.786f, 18.552f, 5.673f, 18.699f, 5.557f)
                curveTo(18.994f, 5.324f, 19.193f, 5.119f, 19.32f, 4.903f)
                curveTo(19.59f, 4.443f, 19.497f, 4.189f, 19.42f, 4.071f)
                curveTo(19.312f, 3.906f, 19.068f, 3.75f, 18.736f, 3.75f)
                close()
                moveTo(11.317f, 12f)
                lineTo(15.717f, 6.867f)
                curveTo(15.85f, 6.67f, 15.994f, 6.492f, 16.142f, 6.33f)
                curveTo(15.497f, 6.023f, 15.041f, 5.38f, 15.003f, 4.627f)
                lineTo(10f, 10.463f)
                lineTo(4.759f, 4.349f)
                curveTo(4.4f, 3.93f, 3.769f, 3.881f, 3.349f, 4.241f)
                curveTo(2.93f, 4.6f, 2.881f, 5.231f, 3.241f, 5.651f)
                lineTo(8.683f, 12f)
                lineTo(3.241f, 18.349f)
                curveTo(2.881f, 18.769f, 2.93f, 19.4f, 3.349f, 19.759f)
                curveTo(3.769f, 20.119f, 4.4f, 20.07f, 4.759f, 19.651f)
                lineTo(10f, 13.537f)
                lineTo(15.241f, 19.651f)
                curveTo(15.6f, 20.07f, 16.232f, 20.119f, 16.651f, 19.759f)
                curveTo(17.07f, 19.4f, 17.119f, 18.769f, 16.759f, 18.349f)
                lineTo(11.317f, 12f)
                close()
            }
        }.build()

        return _TextSuperscript!!
    }

@Suppress("ObjectPropertyName")
private var _TextSuperscript: ImageVector? = null

@Preview
@Composable
private fun TextSuperscriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextSuperscript, contentDescription = null)
    }
}
