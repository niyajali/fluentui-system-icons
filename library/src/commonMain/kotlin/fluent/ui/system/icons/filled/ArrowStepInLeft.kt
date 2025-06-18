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

public val FluentIcons.Filled.ArrowStepInLeft: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowStepInLeft",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.295f, 16.234f)
            curveTo(15.579f, 16.535f, 15.566f, 17.01f, 15.266f, 17.295f)
            curveTo(14.965f, 17.579f, 14.49f, 17.566f, 14.205f, 17.266f)
            lineTo(9.706f, 12.516f)
            curveTo(9.431f, 12.226f, 9.431f, 11.774f, 9.706f, 11.484f)
            lineTo(14.205f, 6.734f)
            curveTo(14.49f, 6.433f, 14.965f, 6.421f, 15.266f, 6.706f)
            curveTo(15.566f, 6.99f, 15.579f, 7.465f, 15.295f, 7.766f)
            lineTo(11.994f, 11.25f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 11.25f, 22f, 11.586f, 22f, 12f)
            curveTo(22f, 12.414f, 21.664f, 12.75f, 21.25f, 12.75f)
            horizontalLineTo(11.994f)
            lineTo(15.295f, 16.234f)
            close()
            moveTo(2f, 12f)
            curveTo(2f, 10.343f, 3.343f, 9f, 5f, 9f)
            curveTo(6.657f, 9f, 8f, 10.343f, 8f, 12f)
            curveTo(8f, 13.657f, 6.657f, 15f, 5f, 15f)
            curveTo(3.343f, 15f, 2f, 13.657f, 2f, 12f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowStepInLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowStepInLeft, contentDescription = null)
    }
}
