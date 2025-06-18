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

public val FluentIcons.Filled.Patch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Patch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.798f, 3.237f)
            lineTo(11.292f, 4.732f)
            lineTo(4.732f, 11.292f)
            lineTo(3.237f, 9.798f)
            curveTo(1.968f, 8.529f, 1.968f, 6.471f, 3.237f, 5.202f)
            lineTo(5.202f, 3.237f)
            curveTo(6.471f, 1.968f, 8.529f, 1.968f, 9.798f, 3.237f)
            close()
            moveTo(14.201f, 20.762f)
            lineTo(12.707f, 19.267f)
            lineTo(19.267f, 12.707f)
            lineTo(20.762f, 14.201f)
            curveTo(22.031f, 15.471f, 22.031f, 17.528f, 20.762f, 18.798f)
            lineTo(18.798f, 20.762f)
            curveTo(17.528f, 22.031f, 15.471f, 22.031f, 14.201f, 20.762f)
            close()
            moveTo(3.237f, 14.201f)
            curveTo(1.968f, 15.471f, 1.968f, 17.528f, 3.237f, 18.798f)
            lineTo(5.202f, 20.762f)
            curveTo(6.471f, 22.031f, 8.529f, 22.031f, 9.798f, 20.762f)
            lineTo(20.762f, 9.798f)
            curveTo(22.032f, 8.529f, 22.032f, 6.471f, 20.762f, 5.202f)
            lineTo(18.798f, 3.237f)
            curveTo(17.529f, 1.968f, 15.471f, 1.968f, 14.202f, 3.237f)
            lineTo(3.237f, 14.201f)
            close()
            moveTo(12.75f, 9f)
            curveTo(12.75f, 9.414f, 12.414f, 9.75f, 12f, 9.75f)
            curveTo(11.585f, 9.75f, 11.25f, 9.414f, 11.25f, 9f)
            curveTo(11.25f, 8.585f, 11.585f, 8.25f, 12f, 8.25f)
            curveTo(12.414f, 8.25f, 12.75f, 8.585f, 12.75f, 9f)
            close()
            moveTo(9f, 12.75f)
            curveTo(8.586f, 12.75f, 8.25f, 12.414f, 8.25f, 12f)
            curveTo(8.25f, 11.585f, 8.586f, 11.25f, 9f, 11.25f)
            curveTo(9.414f, 11.25f, 9.75f, 11.585f, 9.75f, 12f)
            curveTo(9.75f, 12.414f, 9.414f, 12.75f, 9f, 12.75f)
            close()
            moveTo(12f, 12.75f)
            curveTo(11.585f, 12.75f, 11.25f, 12.414f, 11.25f, 12f)
            curveTo(11.25f, 11.585f, 11.585f, 11.25f, 12f, 11.25f)
            curveTo(12.414f, 11.25f, 12.75f, 11.585f, 12.75f, 12f)
            curveTo(12.75f, 12.414f, 12.414f, 12.75f, 12f, 12.75f)
            close()
            moveTo(15.75f, 12f)
            curveTo(15.75f, 12.414f, 15.414f, 12.75f, 15f, 12.75f)
            curveTo(14.585f, 12.75f, 14.25f, 12.414f, 14.25f, 12f)
            curveTo(14.25f, 11.585f, 14.585f, 11.25f, 15f, 11.25f)
            curveTo(15.414f, 11.25f, 15.75f, 11.585f, 15.75f, 12f)
            close()
            moveTo(12f, 15.75f)
            curveTo(11.585f, 15.75f, 11.25f, 15.414f, 11.25f, 15f)
            curveTo(11.25f, 14.585f, 11.585f, 14.25f, 12f, 14.25f)
            curveTo(12.414f, 14.25f, 12.75f, 14.585f, 12.75f, 15f)
            curveTo(12.75f, 15.414f, 12.414f, 15.75f, 12f, 15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PatchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Patch, contentDescription = null)
    }
}
