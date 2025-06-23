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

public val FluentIcons.Filled.EmojiLaugh: ImageVector
    get() {
        if (_EmojiLaugh != null) {
            return _EmojiLaugh!!
        }
        _EmojiLaugh = ImageVector.Builder(
            name = "Filled.EmojiLaugh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(14.492f, 9.36f)
                curveTo(14.431f, 9.77f, 14.05f, 10.053f, 13.64f, 9.992f)
                curveTo(13.231f, 9.931f, 12.948f, 9.55f, 13.008f, 9.14f)
                curveTo(13.17f, 8.05f, 14.131f, 7.25f, 15.25f, 7.25f)
                curveTo(16.369f, 7.25f, 17.331f, 8.05f, 17.492f, 9.14f)
                curveTo(17.553f, 9.55f, 17.27f, 9.931f, 16.86f, 9.992f)
                curveTo(16.45f, 10.053f, 16.069f, 9.77f, 16.008f, 9.36f)
                curveTo(15.96f, 9.037f, 15.659f, 8.75f, 15.25f, 8.75f)
                curveTo(14.842f, 8.75f, 14.54f, 9.037f, 14.492f, 9.36f)
                close()
                moveTo(12f, 18f)
                curveTo(8.858f, 18f, 6.763f, 15.637f, 6.5f, 12.75f)
                horizontalLineTo(17.5f)
                curveTo(17.237f, 15.637f, 15.142f, 18f, 12f, 18f)
                close()
                moveTo(8.75f, 8.75f)
                curveTo(8.342f, 8.75f, 8.04f, 9.037f, 7.992f, 9.36f)
                curveTo(7.931f, 9.77f, 7.55f, 10.053f, 7.14f, 9.992f)
                curveTo(6.731f, 9.931f, 6.448f, 9.55f, 6.508f, 9.14f)
                curveTo(6.67f, 8.05f, 7.631f, 7.25f, 8.75f, 7.25f)
                curveTo(9.869f, 7.25f, 10.831f, 8.05f, 10.992f, 9.14f)
                curveTo(11.053f, 9.55f, 10.77f, 9.931f, 10.36f, 9.992f)
                curveTo(9.95f, 10.053f, 9.569f, 9.77f, 9.508f, 9.36f)
                curveTo(9.46f, 9.037f, 9.159f, 8.75f, 8.75f, 8.75f)
                close()
            }
        }.build()

        return _EmojiLaugh!!
    }

@Suppress("ObjectPropertyName")
private var _EmojiLaugh: ImageVector? = null

@Preview
@Composable
private fun EmojiLaughPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EmojiLaugh, contentDescription = null)
    }
}
