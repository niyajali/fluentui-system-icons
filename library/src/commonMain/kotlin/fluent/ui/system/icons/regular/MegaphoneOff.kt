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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.MegaphoneOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MegaphoneOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(6.725f, 7.786f)
            lineTo(3.609f, 8.712f)
            curveTo(2.655f, 8.996f, 2f, 9.873f, 2f, 10.869f)
            verticalLineTo(13.131f)
            curveTo(2f, 14.127f, 2.654f, 15.004f, 3.609f, 15.288f)
            lineTo(5.999f, 15.998f)
            lineTo(6f, 16.499f)
            lineTo(6.005f, 16.699f)
            curveTo(6.109f, 18.815f, 7.858f, 20.499f, 10f, 20.499f)
            curveTo(11.558f, 20.499f, 12.938f, 19.601f, 13.595f, 18.256f)
            lineTo(18.718f, 19.779f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(16.491f, 17.552f)
            lineTo(4.036f, 13.85f)
            curveTo(3.718f, 13.755f, 3.5f, 13.463f, 3.5f, 13.131f)
            verticalLineTo(10.869f)
            curveTo(3.5f, 10.537f, 3.718f, 10.245f, 4.036f, 10.15f)
            lineTo(7.932f, 8.993f)
            lineTo(16.491f, 17.552f)
            close()
            moveTo(7.499f, 16.444f)
            lineTo(12.124f, 17.82f)
            curveTo(11.678f, 18.535f, 10.885f, 18.999f, 10f, 18.999f)
            curveTo(8.619f, 18.999f, 7.5f, 17.88f, 7.5f, 16.499f)
            lineTo(7.499f, 16.444f)
            close()
            moveTo(20.5f, 6.263f)
            verticalLineTo(17.318f)
            lineTo(21.815f, 18.633f)
            curveTo(21.934f, 18.359f, 22f, 18.056f, 22f, 17.738f)
            verticalLineTo(6.263f)
            curveTo(22f, 6.046f, 21.969f, 5.83f, 21.907f, 5.622f)
            curveTo(21.553f, 4.431f, 20.3f, 3.752f, 19.109f, 4.106f)
            lineTo(9.996f, 6.814f)
            lineTo(11.203f, 8.021f)
            lineTo(19.536f, 5.544f)
            curveTo(19.933f, 5.426f, 20.351f, 5.652f, 20.469f, 6.049f)
            curveTo(20.49f, 6.119f, 20.5f, 6.191f, 20.5f, 6.263f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MegaphoneOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MegaphoneOff, contentDescription = null)
    }
}
