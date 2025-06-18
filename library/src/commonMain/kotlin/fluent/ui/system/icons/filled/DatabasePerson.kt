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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.DatabasePerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DatabasePerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20f, 6.5f)
            curveTo(20f, 8.709f, 16.418f, 10.5f, 12f, 10.5f)
            curveTo(7.582f, 10.5f, 4f, 8.709f, 4f, 6.5f)
            curveTo(4f, 4.291f, 7.582f, 2.5f, 12f, 2.5f)
            curveTo(16.418f, 2.5f, 20f, 4.291f, 20f, 6.5f)
            close()
            moveTo(17.768f, 10.928f)
            curveTo(16.152f, 11.616f, 14.137f, 12f, 12f, 12f)
            curveTo(9.608f, 12f, 7.369f, 11.519f, 5.672f, 10.67f)
            curveTo(5.084f, 10.376f, 4.502f, 10.004f, 4f, 9.553f)
            verticalLineTo(18.5f)
            curveTo(4f, 20.709f, 7.582f, 22.5f, 12f, 22.5f)
            curveTo(12.552f, 22.5f, 13.09f, 22.472f, 13.61f, 22.419f)
            curveTo(13.196f, 21.793f, 13f, 21.084f, 13f, 20.375f)
            verticalLineTo(20.272f)
            curveTo(13f, 18.74f, 14.242f, 17.5f, 15.773f, 17.5f)
            horizontalLineTo(16.051f)
            curveTo(15.402f, 16.865f, 15f, 15.979f, 15f, 15f)
            curveTo(15f, 13.631f, 15.786f, 12.445f, 16.932f, 11.87f)
            curveTo(17.324f, 11.673f, 17.662f, 11.354f, 17.768f, 10.928f)
            close()
            moveTo(21f, 15f)
            curveTo(21f, 16.381f, 19.881f, 17.5f, 18.5f, 17.5f)
            curveTo(17.119f, 17.5f, 16f, 16.381f, 16f, 15f)
            curveTo(16f, 13.619f, 17.119f, 12.5f, 18.5f, 12.5f)
            curveTo(19.881f, 12.5f, 21f, 13.619f, 21f, 15f)
            close()
            moveTo(23f, 20.375f)
            curveTo(23f, 21.931f, 21.714f, 23.5f, 18.5f, 23.5f)
            curveTo(15.286f, 23.5f, 14f, 21.937f, 14f, 20.375f)
            verticalLineTo(20.272f)
            curveTo(14f, 19.293f, 14.794f, 18.5f, 15.773f, 18.5f)
            horizontalLineTo(21.227f)
            curveTo(22.206f, 18.5f, 23f, 19.293f, 23f, 20.272f)
            verticalLineTo(20.375f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DatabasePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DatabasePerson, contentDescription = null)
    }
}
