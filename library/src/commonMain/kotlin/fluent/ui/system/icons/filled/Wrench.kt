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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.Wrench: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Wrench",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.5f, 2f)
            curveTo(13.463f, 2f, 11f, 4.462f, 11f, 7.5f)
            curveTo(11f, 7.943f, 11.053f, 8.375f, 11.152f, 8.789f)
            lineTo(2.841f, 17.1f)
            curveTo(1.72f, 18.222f, 1.72f, 20.04f, 2.841f, 21.161f)
            curveTo(3.962f, 22.282f, 5.78f, 22.282f, 6.902f, 21.161f)
            lineTo(15.214f, 12.849f)
            curveTo(15.627f, 12.948f, 16.058f, 13f, 16.5f, 13f)
            curveTo(19.538f, 13f, 22f, 10.538f, 22f, 7.5f)
            curveTo(22f, 6.891f, 21.901f, 6.304f, 21.718f, 5.755f)
            curveTo(21.635f, 5.509f, 21.431f, 5.323f, 21.178f, 5.263f)
            curveTo(20.925f, 5.203f, 20.66f, 5.279f, 20.476f, 5.463f)
            lineTo(18.032f, 7.907f)
            curveTo(17.739f, 8.2f, 17.264f, 8.2f, 16.971f, 7.907f)
            lineTo(16.093f, 7.029f)
            curveTo(15.8f, 6.736f, 15.8f, 6.262f, 16.093f, 5.969f)
            lineTo(18.538f, 3.524f)
            curveTo(18.721f, 3.341f, 18.797f, 3.075f, 18.737f, 2.822f)
            curveTo(18.677f, 2.569f, 18.491f, 2.365f, 18.245f, 2.283f)
            curveTo(17.696f, 2.099f, 17.109f, 2f, 16.5f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WrenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Wrench, contentDescription = null)
    }
}
